package com.udemy.patterns.behavioral.command;

/**
 * Invoker: CreditCardInvoker
 */
public class CreditCardInvoker {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void run() {
    command.execute();
  }
}
