package de.dasphiller.extensions.extensions

import net.axay.kspigot.main.KSpigotMainInstance
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.inventory.ItemStack
import java.nio.file.Files
import kotlin.io.path.div
import org.bukkit.Material
import org.bukkit.Material.AIR
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.World
import org.bukkit.WorldCreator
import org.bukkit.entity.EntityType

fun location(world: String, x: Int, y: Int, z: Int): Location {
    if (!Bukkit.getWorlds().contains(Bukkit.getWorld(world))) throw NullPointerException("World $world is null!")
    return Location(Bukkit.getWorld(world), x.toDouble(), y.toDouble(), z.toDouble())
}
fun dropItem(location: Location, item: Material) {
    if (item == AIR) throw NullPointerException("Air can't drop")
    location.block.world.dropItem(location, ItemStack(item))
}

fun deleteWorld(world: String) {
    val worldPath = Bukkit.getWorldContainer().toPath() / world
    try {
        Files.walk(worldPath).sorted(Comparator.reverseOrder()).forEach {
            Files.delete(it)
        }
    } catch (e: Exception) {
        INSTANCE.logger.warning("An Error occured while trying to delete the world files ($world)")
        INSTANCE.logger.warning(e.stackTraceToString())
    }
    Files.createDirectories(worldPath)
    Files.createDirectories(worldPath / "data")
    Files.createDirectories(worldPath / "datapacks")
    Files.createDirectories(worldPath / "playerdata")
    Files.createDirectories(worldPath / "poi")
    Files.createDirectories(worldPath / "region")
}

val mm = MiniMessage.miniMessage()

val INSTANCE = KSpigotMainInstance

fun spawnEntity(location: Location, entity: EntityType) {
    location.world.spawnEntity(location, entity)
}

fun world(world: String): World? {
    if (!Bukkit.getWorlds().contains(Bukkit.getWorld(world))) throw NullPointerException("World $world is null")
    return Bukkit.getWorld(world)
}

fun createWorld(world_name: String, environment: World.Environment) {
    val world: World?
    val worldCreator = WorldCreator(world_name).environment(environment)
    world = worldCreator.createWorld()
}