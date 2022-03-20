package com.github.martinklapacz.intellijplugintutorial.lang.psi

import com.github.martinklapacz.intellijplugintutorial.lang.PebbleLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull


class PebbleTokenType(@NotNull debugName: @NonNls String?) :
    IElementType(debugName!!, PebbleLanguage) {
    override fun toString(): String {
        return "PebbleTokenType." + super.toString()
    }
}