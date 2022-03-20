package com.github.martinklapacz.intellijplugintutorial.lang

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.


class PebbleColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon? {
        return PebbleIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return PebbleSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """# You are reading the ".properties" entry.
            ! The exclamation mark can also mark text as comments.
            website = https://en.wikipedia.org/
            language = English
            # The backslash below tells the application to continue reading
            # the value onto the next line.
            message = Welcome to \
                      Wikipedia!
            # Add spaces to the key
            key\ with\ spaces = This is the value that could be looked up with the key "key with spaces".
            # Unicode
            tab : \u0009"""
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Pebble"
    }

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Key", PebbleSyntaxHighlighter.KEY),
            AttributesDescriptor("Separator", PebbleSyntaxHighlighter.SEPARATOR),
            AttributesDescriptor("Value", PebbleSyntaxHighlighter.VALUE),
            AttributesDescriptor("Bad value", PebbleSyntaxHighlighter.BAD_CHARACTER)
        )
    }
}