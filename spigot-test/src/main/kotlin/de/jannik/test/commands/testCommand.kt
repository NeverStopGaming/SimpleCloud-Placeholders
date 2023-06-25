package de.jannik.test.commands

import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class testCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("§cYou must be a player to execute this command.")
            return true
        }

        val player = sender
        sender.sendMessage("SERVICE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVICE%")}")
        sender.sendMessage("ONLINE_PLAYERS: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_ONLINE_PLAYERS%")}")
        sender.sendMessage("ONLINE_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_ONLINE_COUNT%")}")
        sender.sendMessage("MOTD: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_MOTD%")}")
        sender.sendMessage("HOST: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_HOST%")}")
        sender.sendMessage("PORT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PORT%")}")
        sender.sendMessage("STATE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_STATE%")}")
        sender.sendMessage("NUMBER: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_NUMBER%")}")
        sender.sendMessage("WRAPPER: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER%")}")
        sender.sendMessage("MAX_PLAYERS: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_MAX_PLAYERS%")}")
        sender.sendMessage("GROUP: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_GROUP%")}")
        sender.sendMessage("TEMPLATE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_TEMPLATE%")}")
        sender.sendMessage("PLAYER: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PLAYER%")}")
        sender.sendMessage("PLAYER_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PLAYER_NAME%")}")
        sender.sendMessage("PRIORITY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PRIORITY%")}")
        sender.sendMessage("PROXY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY%")}")
        sender.sendMessage("SERVER: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER%")}")
        sender.sendMessage("SERVICES_ONLINE_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVICES_ONLINE_COUNT%")}")
        sender.sendMessage("DISPLAYNAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_DISPLAYNAME%")}")
        sender.sendMessage("SERVICE_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVICE_COUNT%")}")
        sender.sendMessage("WRAPPER_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_NAME%")}")
        sender.sendMessage("WRAPPER_HOST: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_HOST%")}")
        sender.sendMessage("WRAPPER_MAX_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_MAX_MEMORY%")}")
        sender.sendMessage("WRAPPER_UNUSED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_UNUSED_MEMORY%")}")
        sender.sendMessage("WRAPPER_USED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_USED_MEMORY%")}")
        sender.sendMessage("WRAPPER_CURRENTLY_STARTING_SERVICES: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_CURRENTLY_STARTING_SERVICES%")}")
        sender.sendMessage("WRAPPER_CPU_USAGE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_CPU_USAGE%")}")
        sender.sendMessage("WRAPPER_GET_SERVICES_RUNNING_ON_THIS_WRAPPER: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_WRAPPER_SERVICES_RUNNING_ON_THIS_WRAPPER%")}")
        sender.sendMessage("REGISTERED_PLAYER_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_REGISTERED_PLAYER_COUNT%")}")
        sender.sendMessage("RANK_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_RANK_NAME%")}")
        sender.sendMessage("PROXY_GROUP_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_GROUP_NAME%")}")
        sender.sendMessage("PROXY_GROUP_TEMPLATE_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_GROUP_TEMPLATE_NAME%")}")
        sender.sendMessage("PROXY_DISPLAY_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_DISPLAY_NAME%")}")
        sender.sendMessage("PROXY_PORT: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_PORT%")}")
        sender.sendMessage("PROXY_MOTD: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_MOTD%")}")
        sender.sendMessage("PROXY_USED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_USED_MEMORY%")}")
        sender.sendMessage("PROXY_MAX_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_MAX_MEMORY%")}")
        sender.sendMessage("PROXY_STATE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_STATE%")}")
        sender.sendMessage("PROXY_WRAPPER_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_WRAPPER_NAME%")}")
        sender.sendMessage("PROXY_PROPERTIES: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_PROPERTIES%")}")
        sender.sendMessage("PROXY_IS_JOINABLE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_IS_JOINABLE%")}")
        sender.sendMessage("PROXY_IS_AUTHENTICATED: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_IS_AUTHENTICATED%")}")
        sender.sendMessage("PROXY_IS_FULL: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_IS_FULL%")}")
        sender.sendMessage("PROXY_IS_ONLINE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PROXY_IS_ONLINE%")}")
        sender.sendMessage("SERVER_IS_JOINABLE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_JOINABLE%")}")
        sender.sendMessage("SERVER_IS_FULL: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_FULL%")}")
        sender.sendMessage("SERVER_IS_STATIC: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_STATIC%")}")
        sender.sendMessage("SERVER_IS_LOBBY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_LOBBY%")}")
        sender.sendMessage("SERVER_IS_AUTHENTICATED: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_AUTHENTICATED%")}")
        sender.sendMessage("SERVER_IS_ACTIVE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_ACTIVE%")}")
        sender.sendMessage("SERVER_TEMPLATE_NAME: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_TEMPLATE_NAME%")}")
        sender.sendMessage("SERVER_ONLINE_PLAYERS: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_ONLINE_PLAYERS%")}")
        sender.sendMessage("SERVER_IS_ONLINE: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_ONLINE%")}")
        sender.sendMessage("SERVER_IS_FULL: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_IS_FULL%")}")
        sender.sendMessage("SERVER_USED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_USED_MEMORY%")}")
        sender.sendMessage("SERVER_MAX_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%CLOUD_SERVER_MAX_MEMORY%")}")


        return true
    }
}