package com.github.martinklapacz.intellijplugintutorial.lang

import com.github.martinklapacz.intellijplugintutorial.lang.psi.PebbleTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.




class PebbleSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return PebbleLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType == PebbleTypes.SEPARATOR) {
            return SEPARATOR_KEYS
        }
        if (tokenType == PebbleTypes.KEY) {
            return KEY_KEYS
        }
        if (tokenType == PebbleTypes.VALUE) {
            return VALUE_KEYS
        }
        if (tokenType == PebbleTypes.COMMENT) {
            return COMMENT_KEYS
        }
        return if (tokenType == TokenType.BAD_CHARACTER) {
            BAD_CHAR_KEYS
        } else EMPTY_KEYS
    }

    companion object {
        val SEPARATOR = TextAttributesKey.createTextAttributesKey(
            "Pebble_SEPARATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val KEY = TextAttributesKey.createTextAttributesKey("Pebble_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = TextAttributesKey.createTextAttributesKey("Pebble_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT =
            TextAttributesKey.createTextAttributesKey("Pebble_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER =
            TextAttributesKey.createTextAttributesKey("Pebble_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        private val KEY_KEYS = arrayOf(KEY)
        private val VALUE_KEYS = arrayOf(VALUE)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>();
    }
}