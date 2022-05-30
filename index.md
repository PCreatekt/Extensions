# Extensions
## Version: 1.2 
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

### Get a Location
```kt
val loc = location("world_name", 0, 0, 0)
```
