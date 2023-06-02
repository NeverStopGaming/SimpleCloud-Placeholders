package de.jannik.simplecloud.placeholders.plugin.hook

import eu.thesimplecloud.api.CloudAPI
import eu.thesimplecloud.module.permission.PermissionPool
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

        val cloudPlayer = CloudAPI.instance.getCloudPlayerManager().getCloudPlayer(player.uniqueId).getBlockingOrNull() ?: return params
        val permissionPlayer = PermissionPool.instance.getPermissionPlayerManager().getPermissionPlayer(player.uniqueId).getBlockingOrNull() ?: return params
        val proxy = CloudAPI.instance.getCloudPlayerManager().getCloudPlayer(player.uniqueId).getBlockingOrNull()?.getConnectedProxy() ?: return params
        val thisService = CloudPlugin.instance.thisService()
        val wrapper = proxy.getWrapper()
        val cloudPlayerManager = CloudAPI.instance.getCloudPlayerManager()

        return if(params.equals("ONLINE_PLAYERS", true)) cloudPlayerManager.getNetworkOnlinePlayerCount().getBlockingOrNull().toString()
        else if(params.equals("MAX_PLAYERS", true)) proxy.getMaxPlayers().toString()
        else if(params.equals("RANK_NAME", true)) permissionPlayer.getHighestPermissionGroup().getName()
        else if(params.equals("RANK_PRIORITY", true)) permissionPlayer.getHighestPermissionGroup().getPriority().toString()
        else if(params.equals("CURRENT_GROUP_NAME", true)) thisService.getGroupName()
        else if(params.equals("CURRENT_SERVER", true)) thisService.getName()
        else if(params.equals("CURRENT_SERVER_DISPLAY_NAME", true)) thisService.getDisplayName()
        else if(params.equals("CURRENT_PROXY", true)) proxy.getName()
        else if(params.equals("MAX_MEMORY", true)) wrapper.getMaxMemory().toString()
        else if(params.equals("USED_MEMORY", true)) wrapper.getUsedMemory().toString()
        else if(params.equals("UNUSED_MEMORY", true)) wrapper.getUnusedMemory().toString()
        else if(params.equals("PORT", true)) proxy.getPort().toString()
        else if(params.equals("REGISTERED_PLAYER_COUNT", true)) cloudPlayerManager.getRegisteredPlayerCount().getBlockingOrNull().toString()

        else params
    }

}