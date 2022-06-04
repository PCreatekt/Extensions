package de.dasphiller.extensions.message

import de.dasphiller.extensions.extensions.INSTANCE

enum class MessagePrefix(val prefix: String) {
    DEFAULT("<color:#999999>[<color:#3d85c6>${INSTANCE.description.prefix}<color:#999999>]<color:#3d85c6> "),
    ERROR("<color:#f44336>Error » ")
}