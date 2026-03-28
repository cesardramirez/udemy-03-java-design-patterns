package com.udemy.patterns.behavioral.observer;

/**
 * Subject: Subject
 */
public interface Subject {
  void attach(Observer o);

  void detach(Observer o);

  void notifyObservers();
}
