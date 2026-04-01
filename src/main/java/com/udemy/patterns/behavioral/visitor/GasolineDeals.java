package com.udemy.patterns.behavioral.visitor;

/**
 * ConcreteElementB: GasolineDeals
 */
public class GasolineDeals implements DealElement {

  @Override
  public void accept(CreditCardVisitor visitor) {
    visitor.gasolineDeals(this);
  }
}
