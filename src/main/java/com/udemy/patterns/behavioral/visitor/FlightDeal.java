package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteElementA: FlightDeal
 */
public class FlightDeal implements Deal {

  private final double ticketPrice;

  public FlightDeal(double ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public double getTicketPrice() {
    return ticketPrice;
  }

  @Override
  public String accept(CreditCardVisitor visitor) {
    return visitor.visit(this);
  }
}
