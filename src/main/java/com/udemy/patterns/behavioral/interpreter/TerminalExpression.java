package com.udemy.patterns.behavioral.interpreter;

/**
 * TerminalExpression: TerminalExpression
 */
public class TerminalExpression implements Expression {

  private final String value;

  public TerminalExpression(String value) {
    if (value == null || value.isEmpty()) {
      throw new IllegalArgumentException("Value cannot be null or empty");
    }
    this.value = value.toLowerCase();
  }

  @Override
  public boolean interpret(Context context) {
    return context.contains(value);
  }
}
