package com.udemy.patterns.behavioral.strategy;

/**
 * ConcreteStrategy1: LowerCaseFormatter
 */
public class LowerCaseFormatter implements TextFormatter {

  @Override
  public String format(String text) {
    return text.toLowerCase();
  }
}
