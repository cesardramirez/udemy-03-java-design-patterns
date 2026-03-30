package com.udemy.patterns.behavioral.interpreter;

/**
 * TerminalExpression: TerminalExpression
 */
public class TerminalExpression implements Expression {

  private final String value;

  public TerminalExpression(String value) {
    this.value = value.toLowerCase();
  }

  @Override
  public boolean interpret(Context context) {
    return context.contains(value);
  }
}
