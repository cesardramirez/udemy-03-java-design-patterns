package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteElementA: FlightDeals
 */
public class FlightDeals implements DealElement {

  @Override
  public void accept(CreditCardVisitor visitor) {
    visitor.flightDeals(this);
  }
}
