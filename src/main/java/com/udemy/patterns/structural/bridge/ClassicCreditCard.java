package com.udemy.patterns.structural.bridge;

/**
 * RefinedAbstraction: ClassicCreditCard
 */
public class ClassicCreditCard extends CreditCard {

  public ClassicCreditCard(ICreditCard creditCard) {
    super(creditCard);
  }

  @Override
  public void makePayment() {
    creditCard.makePayment();
  }
}
