package com.github.martinklapacz.intellijplugintutorial.lang.psi

import com.github.martinklapacz.intellijplugintutorial.lang.PebbleLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull


class PebbleElementType(@NotNull debugName: @NonNls String?) : IElementType(debugName.toString(), PebbleLanguage)