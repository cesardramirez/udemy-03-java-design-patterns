package com.udemy.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator: ChatMediator
 */
public class ChatMediator implements Mediator {

  private final List<Colleague> colleagues = new ArrayList<>();

  @Override
  public void register(Colleague colleague) {
    colleagues.add(colleague);
  }

  @Override
  public void send(String message, Colleague sender) {
    for(Colleague colleague : colleagues) {
      if (colleague != sender) {
        colleague.messageReceived(message);
      }
    }
  }
}
