package com.udemy.patterns.creational.singleton;

/**
 * Singleton: Card
 * El enum permite que sea una ùnica instancia creada por la JVM.
 */
public enum Card {

  INSTANCE;

  private String cardNumber;

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
}
