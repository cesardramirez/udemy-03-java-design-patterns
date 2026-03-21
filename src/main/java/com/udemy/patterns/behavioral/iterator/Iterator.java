package com.udemy.patterns.behavioral.iterator;

/**
 * Iterator: Iterator
 */
public interface Iterator {

  boolean hasNext();

  Object next();

  Object currentItem();
}
