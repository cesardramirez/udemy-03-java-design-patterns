package com.udemy.patterns.behavioral.iterator;

/**
 * ConcreteAggregate: CardList
 */
public class CardList implements CardCollection {

  private final Card[] cards;

  public CardList(Card[] cards) {
    this.cards = cards;
  }

  @Override
  public MyIterator<Card> iterator() {
    return new CardIterator(cards);
  }
}
