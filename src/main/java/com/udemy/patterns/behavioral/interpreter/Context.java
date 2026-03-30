package com.udemy.patterns.behavioral.interpreter;

import java.util.Arrays;
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

    Arrays.stream(input.split(","))
            .map(String::trim)
            .map(String::toLowerCase)
            .forEach(tokens::add);
  }

  public boolean contains(String value) {
    return tokens.contains(value.toLowerCase());
  }
}
