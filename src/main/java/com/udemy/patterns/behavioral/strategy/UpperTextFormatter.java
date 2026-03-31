package com.udemy.patterns.behavioral.strategy;

/**
 * ConcreteStrategy2: UpperTextFormatter
 */
public class UpperTextFormatter implements TextFormatter {

  @Override
  public String format(String text) {
    return text.toUpperCase();
  }
}
