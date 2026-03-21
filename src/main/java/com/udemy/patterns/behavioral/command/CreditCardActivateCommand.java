package com.udemy.patterns.behavioral.command;

/**
 * ConcreteCommand1: CreditCardDesactivateCommand
 * Un comando puede ejecutar varias operaciones.
 */
public class CreditCardActivateCommand implements Command {

  private final CreditCard creditCard;

  public CreditCardActivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }

  @Override
  public void execute() {
    creditCard.sendPinNumberToCustomer();
    creditCard.activate();
    creditCard.sendSMSToCustomerActivate();
  }
}