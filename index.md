# Extensions
[ ![Latest version](https://img.shields.io/maven-central/v/de.dasphiller.extensions/extensions?color=yellow&label=latest%20version&style=for-the-badge) ](https://repo1.maven.org/maven2/de/dasphiller/extensions/extensions/)
## Install
### Kotlin DSL:
```kt
dependencies {
    implementation("de.dasphiller.extensions:extensions:2.0")
}
```
### And add ```"de.dasphiller.extensions:extensions:2.0"``` to the libraries of you plugin.yml
### Gradle DSL:
```kt
dependencies {
    implementation 'de.dasphiller.extensions:extensions:2.0'
}
```
### And add ```"de.dasphiller.extensions:extensions:2.0"``` to the libraries of you plugin.yml

## Or use the [template](https://github.com/DasPhiller/plugin-template)

## Examples:
### Get a world:
```kt
val world = world("world_name")
```

### Get an location
```kt
val loc = location("world_name", 0, 0, 0)
```

### Drop an item
```kt
dropItem(location, Material)
```

### Delete a world
```kt
deleteWorld("world_name")
```

### Spawn an entity
```kt
spawnEntity(location, EntityType)
```

### Clear the inventory of a player
```kt
player.clearInventory()
```

### Boost a player
```kt
player.boost(0, 1, 0)
```
(this boosts the player a few blocks up)

### Use minimessage
```kt
player.sendMessage(mm.deserialize("<color:#ce7e00>Hey"))
```
(Sends the player the message "Hey" in the color orange)

### Get the plugin instance
```kt
INSTANCE.logger.info("test")
```
(Sends the message "test" in the console)

### Create a world
```kt
createWorld("world_name", World.Environment.NORMAL)
```
(Creats a new overworld)

### Use Message
```kt
Message(
	MessagePrefix.DEFAULT,
        "test"
).sendPlayerMessage(player)
```
(Sends the player the Message "Test". The prefix is the name of your plugin)
