package com.udemy.patterns.behavioral.interpreter;

/**
 * TerminalExpression: TerminalExpression
 */
public class TerminalExpression implements Expression {

  private String text;

  public TerminalExpression(String text) {
    this.text = text;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(text);
  }
}
