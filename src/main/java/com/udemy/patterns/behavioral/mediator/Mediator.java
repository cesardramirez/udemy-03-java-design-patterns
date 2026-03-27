package com.udemy.patterns.behavioral.mediator;

/**
 * Mediator: Mediator
 */
public interface Mediator {
  void register(Colleague colleague);

  void send(String message, Colleague colleague);
}
