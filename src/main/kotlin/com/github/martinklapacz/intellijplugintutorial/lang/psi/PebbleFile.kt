package com.github.martinklapacz.intellijplugintutorial.lang.psi

import com.github.martinklapacz.intellijplugintutorial.lang.PebbleFileType
import com.github.martinklapacz.intellijplugintutorial.lang.PebbleLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull


class PebbleFile(@NotNull viewProvider: FileViewProvider?) : PsiFileBase(viewProvider!!, PebbleLanguage) {

    @NotNull
    override fun getFileType(): FileType {
        return PebbleFileType
    }

    override fun toString(): String {
        return "Pebble File"
    }
}