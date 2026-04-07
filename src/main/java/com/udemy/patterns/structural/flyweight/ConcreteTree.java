package com.udemy.patterns.structural.flyweight;

/**
 * ConcreteFlyweight: ConcreteTree
 * Objeto compartido por lo cual contiene SOLO el estado intrínseco.
 * Es reutilizable y no cambia por instancia (objeto creado).
 */
public class ConcreteTree implements TreeType {

  // Estado intrínseco (compartido)
  private final String type;
  private final String color;
  private final String texture;

  public ConcreteTree(String type, String color, String texture) {
    this.type = type;
    this.color = color;
    this.texture = texture;
  }

  @Override
  public void display(TreeContext context) {
    System.out.println("Árbol tipo '" + type +
            "' color '" + color +
            "' textura '" + texture +
            "' en posición (" + context.getX() + ", " + context.getY() + ")");
  }
}
