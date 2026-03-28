package com.udemy.patterns.behavioral.memento;

/**
 * Memento: ArticleMemento
 */
public class ArticleMemento {

  private final String autor;
  private final String text;

  public ArticleMemento(String autor, String text) {
    this.autor = autor;
    this.text = text;
  }

  public String getAutor() {
    return autor;
  }

  public String getText() {
    return text;
  }
}
