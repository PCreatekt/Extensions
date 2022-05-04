package org.example.exampleplugin.extensions

import org.bukkit.entity.LivingEntity

fun LivingEntity.killEntity() {
    health = 0.0
}
