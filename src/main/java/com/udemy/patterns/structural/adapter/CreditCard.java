package com.udemy.patterns.structural.adapter;

public class CreditCard implements Payment {

  @Override
  public void pay(TypeCard type) {
    Adapter adapter;
    switch (type) {
      case CLASSIC -> System.out.println("Classic card: Pagando sin ningún tipo de seguridad.");
      case BLACK -> {
        adapter = new Adapter(TypeCard.BLACK);
        adapter.pay(TypeCard.BLACK);
      }
      case GOLD -> {
        adapter = new Adapter(TypeCard.GOLD);
        adapter.pay(TypeCard.GOLD);
      }
      default -> System.out.println("No se reconoce el tipo de la tarjeta en el sistema ( " + type + " ).");
    }
  }
}
