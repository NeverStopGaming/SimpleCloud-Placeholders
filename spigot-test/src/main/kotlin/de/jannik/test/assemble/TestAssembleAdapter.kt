package de.jannik.test.assemble

import io.github.thatkawaiisam.assemble.AssembleAdapter
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.entity.Player

class TestAssembleAdapter : AssembleAdapter {
    override fun getTitle(player: Player): String {
        return "§5§lNeverStopGaming"
    }

    override fun getLines(player: Player): MutableList<String> {
        val mutableList = mutableListOf<String>()

        mutableList.add("§7${"-".repeat(16)}")
        mutableList.add("§7Cloud information")
        mutableList.add("§8» §7Registered players: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_REGISTERED_PLAYER_COUNT%")}")
        mutableList.add("§8» §7Max memory: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_MAX_MEMORY%")}")
        mutableList.add("§8» §7Used memory: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_USED_MEMORY%")}")
        mutableList.add("§8» §7Available memory: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_UNUSED_MEMORY%")}")
        mutableList.add("")
        mutableList.add("§7Proxy information")
        mutableList.add("§8» §7Port: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_PORT%")}")
        mutableList.add("§8» §7Name: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_CURRENT_PROXY%")}")
        mutableList.add("§8» §7Online players: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_ONLINE_PLAYERS%")}")
        mutableList.add("§8» §7Max players: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_MAX_PLAYERS%")}")
        mutableList.add("")
        mutableList.add("§7Rank information")
        mutableList.add("§8» §7Rank: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_RANK_NAME%")}")
        mutableList.add("§8» §7Priority: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_RANK_PRIORITY%")}")
        mutableList.add("")
        mutableList.add("§7Service information")
        mutableList.add("§8» §7Group: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_CURRENT_GROUP_NAME%")}")
        mutableList.add("§8» §7Server: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_CURRENT_SERVER%")}")
        mutableList.add("§8» §7Display name: §5${PlaceholderAPI.setPlaceholders(player, "%CLOUD_CURRENT_SERVER_DISPLAY_NAME%")}")
        mutableList.add("§7${"-".repeat(16)}")

        return mutableList
    }
}