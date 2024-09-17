# Skript Sponge (standalone)

This is a standalone sponge plugin that launches the [SkriptLang](https://github.com/SkriptLang/Skript) bukkit plugin.

> [!WARNING]
> Sponge Forge is currently not supported

## How to install

### Sponge Vanilla

Place inside the ``/mods/`` folder like any other plugin

## How it works

This plugin boots the Soak Bukkit high level emulator in internal mode which launches SkriptLang

This makes no changes to the original plugin code, instead uses [Soak](https://github.com/SoakProject/Soak-Plugin) to
change what the Bukkit calls do

### Notes

This is a high level **emulation** of the Bukkit plugin, this means the following will happen and there isnt anything I
can do about it

- Links for updates will point to the Bukkit plugins, not this version
- Most plugins use the folder of '``./plugins/< pluginName >/``' for config files rather than Sponge's ''`./conf/< pluginId >/`'' and therefore this will too
- Skripts that use Bukkit exclusive features will be recognised, but will not work

All issues should go to this version of SkriptLang rather than the official SkriptLang unless you can replicate it in the official version too

## Permission to use

I have not contacted the devs of SkriptLang, this project is assumed to be ok due to the SkriptLang licence
is [GNU version 3 (2007)](https://github.com/SkriptLang/Skript/blob/master/LICENSE). If any of the SkriptLang devs wish
for me to remove this project and/or remove the ore page, then please contact me and I will be happy to remove the
content

## Standalone (Expected) FAQ's

### Why no Sponge Forge support

Bukkit uses fixed lists that need to be hard coded. These lists are used in many places including the [Material List](https://jd.papermc.io/paper/1.21.1/org/bukkit/Material.html) which contains all items and blocks within Vanilla minecraft. When it comes to forge (as well as any modded platform) mods typically will add blocks and/or items resulting in the Bukkit Material list and the actual block and item lists being different. 

There are ways to hack the java standards to add entries into these fixed lists however that will take time to write and may lead to stability issues.

#### Can i use Skripts on Sponge Forge if my mods don't add items or blocks?

If you use Sponge Forge only because you wish to use a mod that doesn't add any blocks or items and doesn't already have a sponge plugin version (such as Dynmap) then in theory .... ``yes you can`` but any issues that are reported will probably be left until Sponge Forge work starts

#### When will Sponge Forge support come?

No date set to when the work starts, nor how long it will take. The focus is Sponge Vanilla and getting the stability of the emulator for at least SkriptLang in a good place

All I will say is its not likely going to be worked on until API 12 (1.21)

### Can i run on minecraft 1.X.Y

Due to the complexity of emulating Bukkit, the emulator needs to be built for a specific Minecraft version and **shouldn't** be used on any other Minecraft version. All versions of Soak and the stand alone plugins will state what Sponge API they are built towards. You can find a [cheatsheet here](https://docs.spongepowered.org/stable/en/plugin/api-versions.html) to know what Minecraft version(s) they can run on

### Why Skripts

When it comes to the Bukkit plugin eco system,
despite [many requests](https://www.spigotmc.org/threads/spigot-bungeecord-1-17-1-17-1.510208/) for developers to
prevent using NMS (Network
Minecraft server -> minecraft server code), most developers still do. Skripts is a well known plugin that doesn't use
NMS, but also allows users to manipulate the plugin to use different Bukkit hooks.

With the idea that users can test many parts of the Bukkit system without NMS, means I can improve Soak high level
emulation without releasing soak and gaining [issues](https://github.com/SoakProject/Soak-Plugin/issues) about NMS.

### Other Bukkit plugins planned?

In short -> Yes

In long -> More are planned, ready to test more parts of the Soak system. A plugin needs to be NMS free, but also I want
to pick plugins that don't have a Sponge alternative (or port) already as well as the other reasons listed below so
choosing a plugin to make stand alone is something that shouldn't be taken lightly

### Can I request a plugin myself

Yes:

For me to consider the plugin, the plugin must follow the following

- It doesn't use NMS
- It is open source
- It allows redistribution (at least for releasing the plugin on other platforms -> If it uses a traditional open source
  licence it should be fine)

Just create an [issue](https://github.com/SoakProject/Soak-Plugin/issues)



