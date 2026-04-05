package com.udemy.patterns.structural.bridge;

/**
 * Abstraction: CreditCard
 */
public abstract class CreditCard {

  protected ICreditCard creditCard;

  public CreditCard(ICreditCard creditCard) {
    this.creditCard = creditCard;
  }

  abstract public void makePayment();
}
