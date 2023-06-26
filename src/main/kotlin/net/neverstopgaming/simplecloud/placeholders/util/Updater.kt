package net.neverstopgaming.simplecloud.placeholders.util

import com.google.gson.Gson
import eu.thesimplecloud.launcher.startup.Launcher
import net.neverstopgaming.simplecloud.placeholders.pluginName
import net.neverstopgaming.simplecloud.placeholders.pluginVersion
import java.io.File
import java.net.URI
import java.net.URL
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.logging.Level
object Updater {

    private const val updateServer = "https://update.neverstopgaming.net"
    val gson = Gson()
    public val httpClient = java.net.http.HttpClient.newHttpClient()

    private val request =
        HttpRequest.newBuilder(URI("$updateServer/update?plugin=$pluginName")).GET().build()
    private val response = httpClient.send(request, HttpResponse.BodyHandlers.ofString())

    data class UpdateResponse(
        val version: String,
        val url: String
    )

    init {

        if (response.statusCode() == 200) {


            val response = gson.fromJson(response.body(), UpdateResponse::class.java)

            if (response.version != pluginVersion) {

                Launcher.instance.logger.info("$pluginName is outdated! New version: ${response.version} (Current version: $pluginVersion)")

                try {
                    val inputStream =
                        URL(response.url).openStream()

                    Files.copy(
                        inputStream,
                        Paths.get("modules/$pluginName-${response.version}.jar"),
                        StandardCopyOption.REPLACE_EXISTING
                    )

                    File("modules/$pluginName-$pluginVersion.jar").delete()

                    Launcher.instance.logger.info("$pluginName updated to version ${response.version}")

                    Launcher.instance.executeCommand("reload modules $pluginName")

                } catch (e: Exception) {
                    Launcher.instance.logger.log(Level.WARNING, "Failed to download new version of $pluginName", e)
                }

            }

        } else {
            Launcher.instance.logger.log(
                Level.WARNING,
                "Failed to check for updates! Status code: ${response.statusCode()}"
            )
        }
    }
}