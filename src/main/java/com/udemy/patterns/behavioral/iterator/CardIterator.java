package com.udemy.patterns.behavioral.iterator;

/**
 * ConcreteIterator: CardIterator
 */
public class CardIterator implements Iterator {

  private final Card[] cards;
  private int position;

  public CardIterator(Card[] cards) {
    this.cards = cards;
    position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < cards.length;
  }

  @Override
  public Object next() {
    return cards[position++];
  }

  @Override
  public Object currentItem() {
    return cards[position];
  }
}
