package com.github.martinklapacz.intellijplugintutorial.lang

import com.intellij.lang.Language

object PebbleLanguage: Language("Pebble", "text/pebble") {
    override fun isCaseSensitive(): Boolean = true
    override fun getDisplayName(): String = "Pebble"


}