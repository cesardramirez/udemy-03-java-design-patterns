package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteVisitorA: ClassicCreditCardVisitor
 */
public class ClassicCreditCardVisitor implements CreditCardVisitor {

  @Override
  public void gasolineDeals(GasolineDeals gasolineDeals) {
    System.out.println("Descuento del 3% en Gasolina con tu tarjeta Clásica.");
  }

  @Override
  public void flightDeals(FlightDeals flightDeals) {
    System.out.println("Descuento del 5% en tus Vuelos con tu tarjeta Clásica.");
  }
}
