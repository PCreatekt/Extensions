package org.example.exampleplugin.extensions

import net.axay.kspigot.extensions.geometry.LocationArea
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.util.Vector

fun Player.getUnderMaterial(): Material? {
    if (player!!.location.subtract(0.0, 1.0, 0.0).block.type != Material.AIR) {
        return null
    } 
    return player!!.location.subtract(0.0, 1.0, 0.0).block.type
}

fun Player.getUnderBlock(): Block? {
    if (player!!.location.subtract(0.0, 1.0, 0.0).block.type != Material.AIR) {
        return null
    }
    return player!!.location.subtract(0.0, 1.0, 0.0).block
}
fun Player.isInArea(location: Location, location2: Location): Boolean =
    LocationArea(location, location2).isInArea(this.location, false, 0)

fun Player.killPlayer() {
    player!!.health = 0.0
}
fun Player.clearInventory() {
    player!!.inventory.clear()
}
fun Player.boost(x: Int, y: Int, z: Int) {
    player!!.velocity = Vector(x.toDouble(), y.toDouble(), z.toDouble())
}

