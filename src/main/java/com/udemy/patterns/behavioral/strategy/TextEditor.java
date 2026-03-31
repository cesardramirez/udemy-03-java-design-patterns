package com.udemy.patterns.behavioral.strategy;

/**
 * Context: TextEditor
 */
public class TextEditor {

  private TextFormatter formatter;

  public TextEditor(TextFormatter formatter) {
    this.formatter = formatter;
  }

  public void setFormatter(TextFormatter formatter) {
    this.formatter = formatter;
  }

  public void publishText(String text) {
    String result = formatter.format(text);
    System.out.println(result);
  }
}
