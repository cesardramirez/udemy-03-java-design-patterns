package com.udemy.patterns.behavioral.strategy;

/**
 * ConcreteStrategy1: LowerStrategyTextFormatter
 */
public class LowerStrategyTextFormatter implements StrategyTextFormatter {

  @Override
  public void format(String text) {
    System.out.println("Texto en Minúsculas: " + text.toLowerCase());
  }
}
