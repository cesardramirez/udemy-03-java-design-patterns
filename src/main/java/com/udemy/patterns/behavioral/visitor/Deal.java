package com.udemy.patterns.behavioral.visitor;

/**
 * Element: Deal
 */
public interface Deal {
  String accept(CreditCardVisitor visitor);
}
