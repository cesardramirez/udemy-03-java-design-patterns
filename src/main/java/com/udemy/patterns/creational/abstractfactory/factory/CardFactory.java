package com.udemy.patterns.creational.abstractfactory.factory;

import com.udemy.patterns.creational.abstractfactory.TypeCard;
import com.udemy.patterns.creational.abstractfactory.product.Card;
import com.udemy.patterns.creational.abstractfactory.product.MasterCard;
import com.udemy.patterns.creational.abstractfactory.product.Visa;

/**
 * ConcreteFactory1: CardFactory
 * Primera factoría. Crea la tarjeta de crédito.
 * Implementación del AbstractFactory con Product: Card
 */
public class CardFactory implements AbstractFactory<Card> {
  @Override
  public Card create(String type) {
    return switch (TypeCard.fromString(type)) {
      case VISA -> new Visa();
      case MASTERCARD -> new MasterCard();
    };
  }
}
