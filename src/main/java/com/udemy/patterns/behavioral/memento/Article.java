package com.udemy.patterns.behavioral.memento;

/**
 * Originator: Article
 */
public class Article {

  private String autor;
  private String text;

  public Article(String autor, String text) {
    this.autor = autor;
    this.text = text;
  }

  public ArticleMemento createMemento() {
    return new ArticleMemento(autor, text);
  }

  public void restore(ArticleMemento memento) {
    this.autor = memento.getAutor();
    this.text = memento.getText();
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
