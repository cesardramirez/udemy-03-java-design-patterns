package com.udemy.patterns.creational.singleton;

/**
 * Singleton: Card
 */
public class Card {

  private static Card INSTANCE;  // Pertenece a la clase, no a los objetos. Único objeto.

  private String cardNumber;

  // El static permite que sea llamado sin crear un objeto.
  // El synchronized evita problemas cuando varios hilos acceden al mismo tiempo y crear varios objetos distintos.
  public synchronized static Card getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Card();  // Se crea el objeto sólo cuando se necesita.
    }
    return INSTANCE;
  }


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
}
