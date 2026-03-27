package com.udemy.patterns.behavioral.mediator;

/**
 * ConcreteColleague1: ConcreteColleague1
 */
public class ConcreteColleague1 extends Colleague {

  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void send(String message) {
    mediator.send(message, this);
  }

  @Override
  public void messageReceived(String message) {
    System.out.println("User1 ha recibido el siguiente mensaje: " + message);
  }
}
