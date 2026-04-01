package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteVisitorB: BlackCreditCardVisitor
 */
public class BlackCreditCardVisitor implements CreditCardVisitor {

  @Override
  public String visit(GasolineDeal deal) {
    double discount = deal.getPricePerLiter() * 0.10;
    return "Gasolina: precio $" + deal.getPricePerLiter() +
            " → descuento 10%: $" + discount + " (TC Black)";
  }

  @Override
  public String visit(FlightDeal deal) {
    double discount = deal.getTicketPrice() * 0.25;
    return "Vuelo: precio $" + deal.getTicketPrice() +
            " → descuento 25%: $" + discount + " (TC Black)";
  }
}
