package ml.dasphiller.extensions.extensions

import net.axay.kspigot.main.KSpigotMainInstance
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.inventory.ItemStack
import java.nio.file.Files
import kotlin.io.path.div
import org.bukkit.Material
import org.bukkit.Material.AIR
import net.kyori.adventure.text.minimessage.MiniMessage
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
        KSpigotMainInstance.logger.warning("An Error occured while trying to delete the world files ($world)")
        KSpigotMainInstance.logger.warning(e.stackTraceToString())
    }
    Files.createDirectories(worldPath)
    Files.createDirectories(worldPath / "data")
    Files.createDirectories(worldPath / "datapacks")
    Files.createDirectories(worldPath / "playerdata")
    Files.createDirectories(worldPath / "poi")
    Files.createDirectories(worldPath / "region")
}

val mm = MiniMessage.miniMessage()

fun spawnEntity(location: Location, entity: EntityType) {
    location.world.spawnEntity(location, entity)
}
