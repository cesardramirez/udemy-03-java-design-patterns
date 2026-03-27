package com.udemy.patterns.behavioral.mediator;

/**
 * Colleague: Colleague
 */
public abstract class Colleague {

  protected Mediator mediator;
  protected String name;

  public Colleague(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  public abstract void send(String message);

  public abstract void messageReceived(String message);
}
