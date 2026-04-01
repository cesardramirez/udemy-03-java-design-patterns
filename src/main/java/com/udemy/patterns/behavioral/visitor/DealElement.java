package com.udemy.patterns.behavioral.visitor;

/**
 * Element: DealElement
 */
public interface DealElement {
  void accept(CreditCardVisitor visitor);
}
