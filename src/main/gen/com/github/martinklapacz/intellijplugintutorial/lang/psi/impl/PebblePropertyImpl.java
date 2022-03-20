// This is a generated file. Not intended for manual editing.
package com.github.martinklapacz.intellijplugintutorial.lang.psi.impl;

import com.github.martinklapacz.intellijplugintutorial.lang.psi.PebbleProperty;
import com.github.martinklapacz.intellijplugintutorial.lang.psi.PebbleVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class PebblePropertyImpl extends ASTWrapperPsiElement implements PebbleProperty {

  public PebblePropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PebbleVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PebbleVisitor) accept((PebbleVisitor)visitor);
    else super.accept(visitor);
  }

}
