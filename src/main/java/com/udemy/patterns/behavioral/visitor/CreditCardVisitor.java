package com.udemy.patterns.behavioral.visitor;

/**
 * Visitor: CreditCardVisitor
 */
public interface CreditCardVisitor {
  String visit(GasolineDeal gasolineDeal);

  String visit(FlightDeal flightDeal);
}
