package com.udemy.patterns.behavioral.strategy;

/**
 * ConcreteStrategy2: UpperStrategyTextFormatter
 */
public class UpperStrategyTextFormatter implements StrategyTextFormatter {

  @Override
  public void format(String text) {
    System.out.println("Texto en Mayúsculas: " + text.toUpperCase());
  }
}
