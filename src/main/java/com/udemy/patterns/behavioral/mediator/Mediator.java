package com.udemy.patterns.behavioral.mediator;

/**
 * Mediator: Mediator
 */
public interface Mediator {
  void send(String message, Colleague colleague);
}
