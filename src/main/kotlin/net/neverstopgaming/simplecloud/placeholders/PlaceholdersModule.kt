package net.neverstopgaming.simplecloud.placeholders

import eu.thesimplecloud.api.external.ICloudModule
import eu.thesimplecloud.launcher.startup.Launcher
import net.neverstopgaming.simplecloud.placeholders.command.Version
import net.neverstopgaming.simplecloud.placeholders.util.Updater

const val pluginName = "SimpleCloud-Placeholders"
const val pluginVersion = "1.0"
class PlaceholdersModule : ICloudModule {

    override fun onEnable() {

        Updater

        Launcher.instance.commandManager.registerCommand(this, Version)
    }

    override fun onDisable() {

    }

    override fun isReloadable(): Boolean = false
}