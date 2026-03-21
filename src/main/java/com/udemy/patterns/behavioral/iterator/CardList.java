package com.udemy.patterns.behavioral.iterator;

/**
 * ConcreteAggregate: CardList
 */
public class CardList implements List {

  private final Card[] cards;

  public CardList(Card[] cards) {
    this.cards = cards;
  }

  @Override
  public Iterator iterator() {
    return new CardIterator(cards);
  }
}
