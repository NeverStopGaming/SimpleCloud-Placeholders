package de.jannik.test

import de.jannik.test.assemble.TestAssembleAdapter
import io.github.thatkawaiisam.assemble.Assemble
import io.github.thatkawaiisam.assemble.AssembleStyle
import org.bukkit.plugin.java.JavaPlugin

class Test : JavaPlugin() {

    override fun onEnable() {

        val assemble = Assemble(this, TestAssembleAdapter())
        assemble.ticks = 20
        assemble.assembleStyle = AssembleStyle.MODERN

    }

}