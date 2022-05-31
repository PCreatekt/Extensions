package de.dasphiller.extensions.message

import de.dasphiller.extensions.extensions.mm
import net.axay.kspigot.extensions.onlinePlayers
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Message(private val messagePrefix: MessagePrefix, private val message: String) {

    fun sendPlayerMessage(player: Player) {
        player.sendMessage(mm.deserialize(messagePrefix.prefix + message))
    }

    fun sendSenderMessage(sender: CommandSender) {
        sender.sendMessage(mm.deserialize(messagePrefix.prefix + message))
    }

    fun broadcast() {
        onlinePlayers.forEach {
            it.sendMessage(mm.deserialize(messagePrefix.prefix + message))
        }
    }
    fun sendBoldPlayerMessage(player: Player) {
        player.sendMessage(mm.deserialize(messagePrefix.prefix + message).decoration(TextDecoration.BOLD, true))
    }
}