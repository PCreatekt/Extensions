package de.dasphiller.extensions.extensions

import org.bukkit.World

fun World.delete() {
    deleteWorld(name)
}