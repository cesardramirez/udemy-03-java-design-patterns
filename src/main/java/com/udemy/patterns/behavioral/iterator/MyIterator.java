package com.udemy.patterns.behavioral.iterator;

/**
 * Iterator: MyIterator
 */
public interface MyIterator<T> {

  boolean hasNext();

  T next();
}
