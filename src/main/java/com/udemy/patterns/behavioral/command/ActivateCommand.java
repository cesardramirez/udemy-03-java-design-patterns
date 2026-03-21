package com.udemy.patterns.behavioral.command;

/**
 * ConcreteCommand1: CreditCardDesactivateCommand
 * Un comando puede ejecutar varias operaciones.
 */
public class ActivateCommand implements Command {

  private final CreditCard creditCard;

  public ActivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    creditCard.sendPin();
    creditCard.activate();
    creditCard.notifyActivation();
  }

  @Override
  public void undo() {
    creditCard.deactivate();
    creditCard.notifyDeactivation();
  }
}