# Extensions
## Version: 1.3
## Install
### Kotlin DSL:
```kt
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}
```

```kt
dependencies {
    implementation("com.github.dasphiller:extensions:VERSION")
}
```
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
