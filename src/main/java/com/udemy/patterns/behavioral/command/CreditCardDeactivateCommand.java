package com.udemy.patterns.behavioral.command;

/**
 * ConcreteCommand1: CreditCardDesactivateCommand
 * Un comando puede ejecutar varias operaciones.
 */
public class CreditCardDeactivateCommand implements Command {

  private final CreditCard creditCard;

  public CreditCardDeactivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    creditCard.desactivate();
    creditCard.sendSMSToCustomerDeactivate();
  }
}
