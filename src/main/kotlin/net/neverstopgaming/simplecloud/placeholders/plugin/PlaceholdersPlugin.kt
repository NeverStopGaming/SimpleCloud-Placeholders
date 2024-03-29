package net.neverstopgaming.simplecloud.placeholders.plugin

import net.neverstopgaming.simplecloud.placeholders.plugin.hook.PlaceholderHook
import org.bukkit.plugin.java.JavaPlugin

class PlaceholdersPlugin : JavaPlugin() {

    override fun onEnable() {
        val register = PlaceholderHook().register()

        if(register) println("[INFO] Registered PlaceholderAPI hook successfully!")
        else println("[FATAL] Failed to register PlaceholderAPI hook!")
    }

    override fun onDisable() {
    }

}