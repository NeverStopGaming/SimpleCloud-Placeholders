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
        sender.sendMessage("MOTD: ${PlaceholderAPI.setPlaceholders(player, "%MOTD%")}")
        sender.sendMessage("HOST: ${PlaceholderAPI.setPlaceholders(player, "%HOST%")}")
        sender.sendMessage("PORT: ${PlaceholderAPI.setPlaceholders(player, "%PORT%")}")
        sender.sendMessage("STATE: ${PlaceholderAPI.setPlaceholders(player, "%STATE%")}")
        sender.sendMessage("NUMBER: ${PlaceholderAPI.setPlaceholders(player, "%NUMBER%")}")
        sender.sendMessage("WRAPPER: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER%")}")
        sender.sendMessage("MAX_PLAYERS: ${PlaceholderAPI.setPlaceholders(player, "%MAX_PLAYERS%")}")
        sender.sendMessage("GROUP: ${PlaceholderAPI.setPlaceholders(player, "%GROUP%")}")
        sender.sendMessage("TEMPLATE: ${PlaceholderAPI.setPlaceholders(player, "%TEMPLATE%")}")
        sender.sendMessage("PLAYER: ${PlaceholderAPI.setPlaceholders(player, "%PLAYER%")}")
        sender.sendMessage("PLAYER_NAME: ${PlaceholderAPI.setPlaceholders(player, "%PLAYER_NAME%")}")
        sender.sendMessage("PRIORITY: ${PlaceholderAPI.setPlaceholders(player, "%PRIORITY%")}")
        sender.sendMessage("PROXY: ${PlaceholderAPI.setPlaceholders(player, "%PROXY%")}")
        sender.sendMessage("SERVER: ${PlaceholderAPI.setPlaceholders(player, "%SERVER%")}")
        sender.sendMessage("SERVICES_ONLINE_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%SERVICES_ONLINE_COUNT%")}")
        sender.sendMessage("DISPLAYNAME: ${PlaceholderAPI.setPlaceholders(player, "%DISPLAYNAME%")}")
        sender.sendMessage("TEMPLATE_NAME: ${PlaceholderAPI.setPlaceholders(player, "%TEMPLATE_NAME%")}")
        sender.sendMessage("TEMPLATE: ${PlaceholderAPI.setPlaceholders(player, "%TEMPLATE%")}")
        sender.sendMessage("SERVICE_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%SERVICE_COUNT%")}")
        sender.sendMessage("WRAPPER_NAME: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_NAME%")}")
        sender.sendMessage("WRAPPER_HOST: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_HOST%")}")
        sender.sendMessage("WRAPPER_MAX_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_MAX_MEMORY%")}")
        sender.sendMessage("WRAPPER_UNUSED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_UNUSED_MEMORY%")}")
        sender.sendMessage("WRAPPER_USED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_USED_MEMORY%")}")
        sender.sendMessage("WRAPPER_CURRENTLY_STARTING_SERVICES: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_CURRENTLY_STARTING_SERVICES%")}")
        sender.sendMessage("WRAPPER_CPU_USAGE: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_CPU_USAGE%")}")
        sender.sendMessage("WRAPPER_GET_SERVICES_RUNNING_ON_THIS_WRAPPER: ${PlaceholderAPI.setPlaceholders(player, "%WRAPPER_GET_SERVICES_RUNNING_ON_THIS_WRAPPER%")}")
        sender.sendMessage("REGISTERED_PLAYER_COUNT: ${PlaceholderAPI.setPlaceholders(player, "%REGISTERED_PLAYER_COUNT%")}")
        sender.sendMessage("RANK_NAME: ${PlaceholderAPI.setPlaceholders(player, "%RANK_NAME%")}")
        sender.sendMessage("PROXY_GROUP_NAME: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_GROUP_NAME%")}")
        sender.sendMessage("PROXY_GROUP_TEMPLATE_NAME: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_GROUP_TEMPLATE_NAME%")}")
        sender.sendMessage("PROXY_PORT: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_PORT%")}")
        sender.sendMessage("PROXY_MOTD: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_MOTD%")}")
        sender.sendMessage("PROXY_USED_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_USED_MEMORY%")}")
        sender.sendMessage("PROXY_MAX_MEMORY: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_MAX_MEMORY%")}")
        sender.sendMessage("PROXY_STATE: ${PlaceholderAPI.setPlaceholders(player, "%PROXY_STATE%")}")

        return true
    }
}