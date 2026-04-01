package com.udemy.patterns.structural.adapter;

public class Adapter implements Payment {

  private Secure secureCreditCard;

  public Adapter(TypeCard type) {
    switch (type) {
      case BLACK -> secureCreditCard = new BlackCreditCard();
      case GOLD -> secureCreditCard = new GoldCreditCard();
      default -> System.out.println("No se reconoce el tipo de la tarjeta.");
    }
  }

  @Override
  public void pay(TypeCard type) {
    switch (type) {
      case BLACK -> secureCreditCard.payWithSecureLevelA();
      case GOLD -> secureCreditCard.payWithSecureLevelZ();
      default -> System.out.println("No se reconoce el tipo de la tarjeta.");
    }
  }
}
