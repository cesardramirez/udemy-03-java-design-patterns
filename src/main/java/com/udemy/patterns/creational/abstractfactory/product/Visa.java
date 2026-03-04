package com.udemy.patterns.creational.abstractfactory.product;

import com.udemy.patterns.creational.abstractfactory.TypeCard;

/**
 * ProductA1: Visa
 */
public class Visa implements Card {
  @Override
  public String getCardType() {
    return TypeCard.VISA.toString();
  }

  @Override
  public String getNumber() {
    return "4242 4242 4242 4242";
  }
}
