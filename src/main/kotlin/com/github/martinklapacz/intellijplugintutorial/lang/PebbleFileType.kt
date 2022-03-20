package com.github.martinklapacz.intellijplugintutorial.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object PebbleFileType: LanguageFileType(PebbleLanguage) {
    override fun getName(): String = "Pebble"

    override fun getDescription(): String = "Pebble files"

    override fun getDefaultExtension(): String = "pebble"

    override fun getCharset(file: VirtualFile, content: ByteArray?): String = "UTF-8"

    override fun getIcon(): Icon = PebbleIcons.FILE
}