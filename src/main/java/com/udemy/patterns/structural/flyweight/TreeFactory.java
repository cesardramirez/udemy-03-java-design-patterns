package com.udemy.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory: TreeFactory
 * Gestiona y reutiliza los objetos Flyweight.
 * Evita duplicados y cachea instancias (objetos creados).
 * Garantiza la reutilización.
 */
public class TreeFactory {

  private static final Map<String, TreeType> trees = new HashMap<>();

  public static TreeType getTree(String type) {
    if (!trees.containsKey(type)) {
      trees.put(type, new ConcreteTree(type, "verde", "texturaX"));
    }

    return trees.get(type);
  }
}
