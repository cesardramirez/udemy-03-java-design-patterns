package com.udemy.patterns.behavioral.strategy;

/**
 * Context: Context
 */
public class Context {

  private final StrategyTextFormatter strategyTextFormatter;

  public Context(StrategyTextFormatter textFormatter) {
    this.strategyTextFormatter = textFormatter;
  }

  public void publishText(String text) {
    strategyTextFormatter.format(text);
  }
}
