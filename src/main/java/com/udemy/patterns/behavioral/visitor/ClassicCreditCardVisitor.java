package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteVisitorA: ClassicCreditCardVisitor
 */
public class ClassicCreditCardVisitor implements CreditCardVisitor {

  @Override
  public String visit(GasolineDeal deal) {
    double discount = deal.getPricePerLiter() * 0.03;
    return "Gasolina: precio $" + deal.getPricePerLiter() +
            " → descuento 3%: $" + discount + " (TC Clásica)";
  }

  @Override
  public String visit(FlightDeal deal) {
    double discount = deal.getTicketPrice() * 0.05;
    return "Vuelo: precio $" + deal.getTicketPrice() +
            " → descuento 5%: $" + discount + " (TC Clásica)";
  }
}
