package com.udemy.patterns.behavioral.command;

import java.util.Stack;

/**
 * Invoker: CreditCardInvoker
 * Se añade un historial del estado de la tarjeta de crédito.
 */
public class CreditCardInvoker {

  private final Stack<Command> history = new Stack<>();

  public void run(Command command) {
    if (command == null) {
      throw new IllegalArgumentException("command cannot be null");
    }
    command.execute();
    history.push(command);
  }

  public void undo() {
    if (!history.isEmpty()) {
      Command command = history.pop();
      command.undo();
    } else {
      System.out.println("No hay comandos para deshacer.");
    }
  }
}
