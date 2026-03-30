package com.udemy.patterns.behavioral.interpreter;

/**
 * AbstractExpression: Expression
 */
public interface Expression {
  boolean interpret(String context);
}
