package net.fabricmc.example

import org.apache.logging.log4j.LogManager

// For support join https://discord.gg/v6v4pMv

@Suppress("unused")
fun init() {
  // This code runs as soon as Minecraft is in a mod-load-ready state.
  // However, some things (like resources) may still be uninitialized.
  // Proceed with mild caution.

  HelloWorld().hi()
}

class HelloWorld {
  private val logger = LogManager.getLogger(javaClass)
  fun hi() {
    logger.info("Hello Fabric woooooooooooooooooooooooorld!")
  }
}