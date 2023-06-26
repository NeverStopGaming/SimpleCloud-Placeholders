package net.neverstopgaming.simplecloud.placeholders.command

import com.google.gson.Gson
import eu.thesimplecloud.api.command.ICommandSender
import eu.thesimplecloud.api.player.impl.CloudPlayer
import eu.thesimplecloud.launcher.console.command.CommandType
import eu.thesimplecloud.launcher.console.command.ICommandHandler
import eu.thesimplecloud.launcher.console.command.annotations.Command
import eu.thesimplecloud.launcher.console.command.annotations.CommandSubPath
import net.neverstopgaming.simplecloud.placeholders.pluginName
import net.neverstopgaming.simplecloud.placeholders.pluginVersion
import net.neverstopgaming.simplecloud.placeholders.util.Updater.httpClient
import java.net.URI
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Command("placeholders", CommandType.CONSOLE_AND_INGAME, "cloud.version")
class Version : ICommandHandler {

    @CommandSubPath("version")
    fun handle(sender: ICommandSender) {

        sender.sendMessage("&aYou are running &eSimpleCloud-Placeholders &av$pluginVersion")
        //make a command send message to player with the latest version from the update server from the Updater class but get the latest version from the server
        //get the latest version from the server and compare it to the current version and if it is not the same then send a message to the player that there is a new version available

        val request =
            HttpRequest.newBuilder(URI("https://update.neverstopgaming.net/update?plugin=$pluginName")).GET().build()
        val response = httpClient.send(request, HttpResponse.BodyHandlers.ofString())

        val gson = Gson()

        data class UpdateResponse(
            val version: String,
            val url: String
        )

        if (response.statusCode() == 200) {
            val response = gson.fromJson(response.body(), UpdateResponse::class.java)
            if (response.version != pluginVersion) {
                sender.sendMessage("&aThere is a new version of &eSimpleCloud-Placeholders &av${response.version} &aavailable!")
            }
        }



    }

}