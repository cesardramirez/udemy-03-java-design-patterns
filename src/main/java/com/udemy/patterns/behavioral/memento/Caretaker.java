package com.udemy.patterns.behavioral.memento;

import java.util.Stack;

/**
 * Caretaker: Caretaker
 */
public class Caretaker {

  private final Stack<Article.Memento> states = new Stack<>();

  public void save(Article article) {
    states.push(article.save());
  }

  public void undo(Article article) {
    if (!states.isEmpty()) {
      article.restore(states.pop());
    } else {
      System.out.println("No hay estados para restaurar");
    }
  }
}
