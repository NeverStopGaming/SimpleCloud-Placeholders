package de.jannik.simplecloud.placeholders.plugin.hook

import eu.thesimplecloud.api.CloudAPI
import eu.thesimplecloud.plugin.startup.CloudPlugin
import me.clip.placeholderapi.expansion.PlaceholderExpansion
import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player

class PlaceholderHook : PlaceholderExpansion() {

    override fun getIdentifier(): String {
        return "CLOUD"
    }

    override fun getAuthor(): String {
        return "Panda, Jannik"
    }

    override fun getVersion(): String {
        return "2.5.0"
    }

    override fun canRegister(): Boolean {
        return true
    }

    override fun persist(): Boolean {
        return true
    }

    override fun onRequest(player: OfflinePlayer, params: String): String {
        return if(params.equals("ONLINE_PLAYERS", true)) CloudAPI.instance.getCloudPlayerManager().getNetworkOnlinePlayerCount().get().toString()
        else if(params.equals("MAX_PLAYERS", true)) CloudAPI.instance.getCloudPlayerManager().getCloudPlayer(player.uniqueId).get().getConnectedProxy()?.getMaxPlayers().toString()
        else params
    }

}