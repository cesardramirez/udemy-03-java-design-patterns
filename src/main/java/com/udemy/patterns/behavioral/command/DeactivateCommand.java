package com.udemy.patterns.behavioral.command;

/**
 * ConcreteCommand2: CreditCardDeactivateCommand
 * Un comando puede ejecutar varias operaciones.
 */
public class DeactivateCommand implements Command {

  private final CreditCard creditCard;

  public DeactivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    creditCard.deactivate();
    creditCard.notifyDeactivation();
  }

  @Override
  public void undo() {
    creditCard.activate();
    creditCard.notifyActivation();
  }
}
