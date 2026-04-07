package com.udemy.patterns.structural.flyweight;

/**
 * ConcreteFlyweight: ConcreteTree
 * Objeto compartido por lo cual contiene el estado intrínseco.
 * Es reutilizable y no cambia por instancia (objeto creado).
 */
public class ConcreteTree implements TreeType {

  private final String type;
  private final String color;
  private final String texture;

  public ConcreteTree(String type, String color, String texture) {
    this.type = type;
    this.color = color;
    this.texture = texture;
  }

  @Override
  public void display(int x, int y) {
    System.out.println("Árbol tipo: " + type +
            " color: " + color +
            " texture: " + texture +
            " en posición (" + x + ", " + y + ")");
  }
}
