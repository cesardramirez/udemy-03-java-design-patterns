package com.udemy.patterns.structural.flyweight;

/**
 * UnsharedFlyweight: TreeContext
 * Objeto compartido por lo cual SOLO contiene el estado extrínseco.
 * Encapsula el Flyweight (TreeType).
 */
public class TreeContext {

  // Estado extrínseco (compartido)
  private final int x;
  private final int y;
  private final TreeType treeType;

  public TreeContext(int x, int y, TreeType treeType) {
    this.x = x;
    this.y = y;
    this.treeType = treeType;
  }

  public int getY() {
    return y;
  }

  public int getX() {
    return x;
  }

  public void display() {
    treeType.display(this);
  }
}
