package com.github.martinklapacz.intellijplugintutorial.lang

import com.intellij.lexer.FlexAdapter


class PebbleLexerAdapter : FlexAdapter(PebbleLexer(null))