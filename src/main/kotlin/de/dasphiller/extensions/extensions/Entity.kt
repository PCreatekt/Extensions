package de.dasphiller.extensions.extensions

import net.axay.kspigot.extensions.geometry.LocationArea
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.block.BlockFace
import org.bukkit.entity.Entity
import org.bukkit.entity.LivingEntity
import org.bukkit.util.Vector

fun LivingEntity.killEntity() {
    health = 0.0
}

fun Entity.isInArea(location: Location, location2: Location): Boolean =
    LocationArea(location, location2).isInArea(this.location, false, 0)

fun Entity.boost(x: Double, y: Double, z: Double) {
    velocity = Vector(x, y, z)
}

fun Entity.getUnderMaterial(): Material? {
    if (location.block.getRelative(BlockFace.DOWN).type == Material.AIR) return null
    return location.block.getRelative(BlockFace.DOWN).type
}

fun Entity.getUnderBlock(): Block? {
    if (location.block.getRelative(BlockFace.DOWN).type == Material.AIR) return null
    return location.block.getRelative(BlockFace.DOWN)
}