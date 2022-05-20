package org.example.exampleplugin.message

import org.example.exampleplugin.extensions.mm
import net.axay.kspigot.extensions.onlinePlayers
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Message(private val prefix: MessagePrefix, private val message: String) {

    fun sendPlayerMessage(player: Player) {
        player.sendMessage(mm.deserialize(prefix.prefix + message))
    }

    fun sendSenderMessage(sender: CommandSender) {
        sender.sendMessage(mm.deserialize(prefix.prefix + message))
    }

    fun broadcast() {
        onlinePlayers.forEach {
            it.sendMessage(mm.deserialize(prefix.prefix + message))
        }
    }
    fun sendBoldPlayerMessage(player: Player) {
        player.sendMessage(mm.deserialize(prefix.prefix + message).decoration(TextDecoration.BOLD, true))
    }
}
