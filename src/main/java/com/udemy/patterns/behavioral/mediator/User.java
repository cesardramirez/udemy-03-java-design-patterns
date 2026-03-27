package com.udemy.patterns.behavioral.mediator;

/**
 * ConcreteColleague: User
 */
public class User extends Colleague {

  public User(Mediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " envía: " + message);
    mediator.send(message, this);
  }

  @Override
  public void messageReceived(String message) {
    System.out.println(name + " recibe: " + message);
  }
}
