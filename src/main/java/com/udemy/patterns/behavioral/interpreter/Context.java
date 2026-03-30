package com.udemy.patterns.behavioral.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * Context: Context
 * Tokens como unidad mínima de información, ejem ["0", "1", "2"].
 */
public class Context {

  private final Set<String> tokens;

  public Context(String input) {
    this.tokens = new HashSet<>();

    for (String token : input.split(",")) {
      tokens.add(token.trim().toLowerCase());
    }
  }

  public boolean contains(String value) {
    return tokens.contains(value.trim().toLowerCase());
  }
}
