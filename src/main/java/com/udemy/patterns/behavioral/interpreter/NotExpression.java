package com.udemy.patterns.behavioral.interpreter;

public class NotExpression implements Expression {

  private final Expression expression;

  public NotExpression(Expression expression) {
    this.expression = expression;
  }

  @Override
  public boolean interpret(Context context) {
    return !expression.interpret(context);
  }
}
