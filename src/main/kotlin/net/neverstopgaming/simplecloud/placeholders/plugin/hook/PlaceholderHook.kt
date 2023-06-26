package net.neverstopgaming.simplecloud.placeholders.plugin.hook

import eu.thesimplecloud.api.CloudAPI
import eu.thesimplecloud.base.manager.startup.Manager
import eu.thesimplecloud.module.permission.PermissionPool
import eu.thesimplecloud.module.permission.manager.PermissionModule
import eu.thesimplecloud.plugin.startup.CloudPlugin
import me.clip.placeholderapi.expansion.PlaceholderExpansion
import org.bukkit.OfflinePlayer

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

        if(Manager.instance.cloudModuleHandler.getLoadedModuleByCloudModule(PermissionModule.instance) == null) {
            if(params.equals("PRIORITY", true) || params.equals("RANK_NAME", true)) return params
        }

        val cloudPlayer = CloudAPI.instance.getCloudPlayerManager().getCloudPlayer(player.uniqueId).getBlockingOrNull() ?: return params
        val permissionPlayer = PermissionPool.instance.getPermissionPlayerManager().getPermissionPlayer(player.uniqueId).getBlockingOrNull() ?: return params
        val proxy = CloudAPI.instance.getCloudPlayerManager().getCloudPlayer(player.uniqueId).getBlockingOrNull()?.getConnectedProxy() ?: return params
        val thisService = CloudPlugin.instance.thisService()
        val wrapper = proxy.getWrapper()
        val cloudPlayerManager = CloudAPI.instance.getCloudPlayerManager()


        return if(params.equals("SERVICE", true)) thisService.getName()
        else if(params.equals("ONLINE_PLAYERS", true)) cloudPlayerManager.getAllCachedObjects().size.toString()
        else if(params.equals("ONLINE_COUNT", true)) cloudPlayerManager.getAllCachedObjects().size.toString()
        else if(params.equals("MOTD", true)) thisService.getMOTD()
        else if(params.equals("HOST", true)) thisService.getHost()
        else if(params.equals("PORT", true)) thisService.getPort().toString()
        else if(params.equals("STATE", true)) thisService.getOnlineCount().toString()
        else if(params.equals("NUMBER", true)) thisService.getServiceNumber().toString()
        else if(params.equals("WRAPPER", true)) wrapper.getName()
        else if(params.equals("MAX_PLAYERS", true)) thisService.getMaxPlayers().toString()
        else if(params.equals("GROUP", true)) thisService.getGroupName()
        else if(params.equals("TEMPLATE", true)) thisService.getTemplate().getName()
        else if(params.equals("PLAYER", true)) cloudPlayer.getName()
        else if(params.equals("PLAYER_NAME", true)) cloudPlayer.getName()
        else if(params.equals("PRIORITY", true)) permissionPlayer.getHighestPermissionGroup().getPriority().toString()
        else if(params.equals("PROXY", true)) proxy.getName()
        else if(params.equals("SERVER", true)) cloudPlayer.getConnectedServerName().toString()
        else if(params.equals("SERVICES_ONLINE_COUNT", true)) CloudAPI.instance.getCloudServiceManager().getAllCachedObjects().size.toString()
        else if(params.equals("DISPLAYNAME", true)) thisService.getDisplayName()
        else if(params.equals("SERVICE_COUNT", true)) proxy.getOnlinePlayers().toString()
        else if(params.equals("WRAPPER_NAME", true)) wrapper.getName()
        else if(params.equals("WRAPPER_HOST", true)) wrapper.getHost()
        else if(params.equals("WRAPPER_MAX_MEMORY", true)) wrapper.getMaxMemory().toString()
        else if(params.equals("WRAPPER_UNUSED_MEMORY", true)) wrapper.getUnusedMemory().toString()
        else if(params.equals("WRAPPER_USED_MEMORY", true)) wrapper.getUsedMemory().toString()
        else if(params.equals("WRAPPER_CURRENTLY_STARTING_SERVICES", true)) wrapper.getCurrentlyStartingServices().toString()
        else if(params.equals("WRAPPER_CPU_USAGE", true)) wrapper.getCpuUsage().toString()
        else if(params.equals("WRAPPER_GET_SERVICES_RUNNING_ON_THIS_WRAPPER", true)) wrapper.getServicesRunningOnThisWrapper().toString()
        else if(params.equals("REGISTERED_PLAYER_COUNT", true)) cloudPlayerManager.getRegisteredPlayerCount().getBlockingOrNull().toString()

        else if(params.equals("RANK_NAME", true)) permissionPlayer.getHighestPermissionGroup().getName()
        else if(params.equals("PROXY_GROUP_NAME", true)) proxy.getGroupName()
        else if(params.equals("PROXY_GROUP_TEMPLATE_NAME", true)) proxy.getTemplateName()
        else if(params.equals("PROXY_DISPLAY_NAME", true)) proxy.getDisplayName()
        else if(params.equals("PROXY_PORT", true)) proxy.getPort().toString()
        else if(params.equals("PROXY_MOTD", true)) proxy.getMOTD()
        else if(params.equals("PROXY_USED_MEMORY", true)) proxy.getUsedMemory().toString()
        else if(params.equals("PROXY_MAX_MEMORY", true)) proxy.getMaxMemory().toString()
        else if(params.equals("PROXY_STATE", true)) proxy.getState().toString()
        else if(params.equals("PROXY_WRAPPER_NAME", true)) proxy.getWrapperName().toString()
        else if(params.equals("PROXY_PROPERTIES", true)) proxy.getProperties().toString()

        else if(params.equals("PROXY_IS_JOINABLE", true)) proxy.isServiceJoinable().toString()
        else if(params.equals("PROXY_IS_AUTHENTICATED", true)) proxy.isAuthenticated().toString()
        else if(params.equals("PROXY_IS_FULL", true)) proxy.isFull().toString()
        else if(params.equals("PROXY_IS_ONLINE", true)) proxy.isOnline().toString()
        else if(params.equals("SERVER_IS_JOINABLE", true)) thisService.isServiceJoinable().toString()
        else if(params.equals("SERVER_IS_FULL", true)) thisService.isFull().toString()
        else if(params.equals("SERVER_IS_STATIC", true)) thisService.isStatic().toString()
        else if(params.equals("SERVER_IS_Lobby", true)) thisService.isLobby().toString()
        else if(params.equals("SERVER_IS_AUTHENTICATED", true)) thisService.isAuthenticated().toString()
        else if(params.equals("SERVER_IS_ACTIVE", true)) thisService.isActive().toString()
        else if(params.equals("SERVER_TEMPLATE_NAME", true)) thisService.getTemplateName()
        else if(params.equals("SERVER_ONLINE_PLAYERS", true)) thisService.getOnlinePlayers().toString()
        else if(params.equals("SERVER_IS_ONLINE", true)) thisService.isOnline().toString()
        else if(params.equals("SERVER_IS_FULL", true)) thisService.isFull().toString()
        else if(params.equals("SERVER_USED_MEMORY", true)) thisService.getUsedMemory().toString()
        else if(params.equals("SERVER_MAX_MEMORY", true)) thisService.getMaxMemory().toString()



        else params

    }

}
