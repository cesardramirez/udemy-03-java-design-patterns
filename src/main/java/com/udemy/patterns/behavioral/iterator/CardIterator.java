package com.udemy.patterns.behavioral.iterator;

import java.util.NoSuchElementException;

/**
 * ConcreteIterator: CardIterator
 */
public class CardIterator implements MyIterator<Card> {

  private final Card[] cards;
  private int position = 0;

  public CardIterator(Card[] cards) {
    this.cards = cards;
  }

  @Override
  public boolean hasNext() {
    return position < cards.length;
  }

  @Override
  public Card next() {
    if (!hasNext()) {
      throw new NoSuchElementException("No hay más elementos.");
    }
    return cards[position++];
  }
}
