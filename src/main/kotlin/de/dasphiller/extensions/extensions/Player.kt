package de.dasphiller.extensions.extensions

import net.axay.kspigot.extensions.geometry.LocationArea
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.BlockFace
import org.bukkit.entity.Player
import org.bukkit.util.Vector

fun Player.getUnderMaterial(): Material? {
    if (player!!.location.block.getRelative(BlockFace.DOWN).type == Material.AIR) return null
    return player!!.location.block.getRelative(BlockFace.DOWN).type
}

fun Player.getUnderBlock(): Block? {
    if (player!!.location.block.getRelative(BlockFace.DOWN).type == Material.AIR) return null
    return player!!.location.block.getRelative(BlockFace.DOWN)
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

