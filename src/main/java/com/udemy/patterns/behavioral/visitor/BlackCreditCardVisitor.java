package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteVisitorB: BlackCreditCardVisitor
 */
public class BlackCreditCardVisitor implements CreditCardVisitor {

  @Override
  public void gasolineDeals(GasolineDeals gasolineDeals) {
    System.out.println("Descuento del 10% en Gasolina con tu tarjeta Black.");
  }

  @Override
  public void flightDeals(FlightDeals flightDeals) {
    System.out.println("Descuento del 25% en tus Vuelos con tu tarjeta Black.");
  }
}
