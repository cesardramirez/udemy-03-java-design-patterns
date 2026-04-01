package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteElementB: GasolineDeal
 */
public class GasolineDeal implements Deal {

  private final double pricePerLiter;

  public GasolineDeal(double pricePerLiter) {
    this.pricePerLiter = pricePerLiter;
  }

  public double getPricePerLiter() {
    return pricePerLiter;
  }

  @Override
  public String accept(CreditCardVisitor visitor) {
    return visitor.visit(this);
  }
}
