// This is a generated file. Not intended for manual editing.
package com.github.martinklapacz.intellijplugintutorial.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.martinklapacz.intellijplugintutorial.lang.psi.impl.*;

public interface PebbleTypes {

  IElementType PROPERTY = new PebbleElementType("PROPERTY");

  IElementType COMMENT = new PebbleTokenType("COMMENT");
  IElementType CRLF = new PebbleTokenType("CRLF");
  IElementType KEY = new PebbleTokenType("KEY");
  IElementType SEPARATOR = new PebbleTokenType("SEPARATOR");
  IElementType VALUE = new PebbleTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new PebblePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
