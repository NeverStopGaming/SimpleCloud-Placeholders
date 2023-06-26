package de.jannik.test

import de.jannik.test.commands.testCommand
import org.bukkit.plugin.java.JavaPlugin

class Test : JavaPlugin() {

    override fun onEnable() {

                getCommand("test").setExecutor(testCommand())


    }

}