package com.udemy.patterns.behavioral.iterator;

/**
 * Aggregate: CardCollection
 */
public interface CardCollection {

  MyIterator<Card> iterator();
}
