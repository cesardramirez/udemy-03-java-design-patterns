package com.udemy.patterns.behavioral.visitor;

/**
 * Visitor: CreditCardVisitor
 */
public interface CreditCardVisitor {
  void gasolineDeals(GasolineDeals gasolineDeals);

  void flightDeals(FlightDeals flightDeals);
}
