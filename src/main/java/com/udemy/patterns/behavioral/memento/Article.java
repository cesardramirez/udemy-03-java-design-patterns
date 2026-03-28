package com.udemy.patterns.behavioral.memento;

/**
 * Originator: Article
 */
public class Article {

  private String author;
  private String text;

  public Article(String author, String text) {
    this.author = author;
    this.text = text;
  }

  /**
   * Memento: Memento (interno, encapsulado)
   */
  public static class Memento {
    private final String author;
    private final String text;

    public Memento(String author, String text) {
      this.author = author;
      this.text = text;
    }
  }

  public Memento save() {
    return new Memento(author, text);
  }

  public void restore(Memento memento) {
    this.author = memento.author;
    this.text = memento.text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
