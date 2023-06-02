package de.jannik.test.assemble

import io.github.thatkawaiisam.assemble.AssembleAdapter
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.entity.Player

class TestAssembleAdapter : AssembleAdapter {
    override fun getTitle(player: Player): String {
        return "Test Title %RANK_NAME%"
    }

    override fun getLines(player: Player): MutableList<String> {
        return mutableListOf("§7Online players", "§a${PlaceholderAPI.setPlaceholders(player, "%CLOUD_ONLINE_PLAYERS%")}", "§7Max players", "§c${PlaceholderAPI.setPlaceholders(player, "%CLOUD_MAX_PLAYERS%")}")
    }
}