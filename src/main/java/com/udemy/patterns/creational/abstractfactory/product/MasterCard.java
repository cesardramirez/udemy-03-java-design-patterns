package com.udemy.patterns.creational.abstractfactory.product;

import com.udemy.patterns.creational.abstractfactory.TypeCard;

/**
 * ProductA2: Mastercard
 */
public class MasterCard implements Card {
  @Override
  public String getCardType() {
    return TypeCard.MASTERCARD.toString();
  }

  @Override
  public String getNumber() {
    return "5555 5555 5555 4444";
  }
}
