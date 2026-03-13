package com.udemy.patterns.behavioral.chainofresponsibility;

public class Card {

  private final ApproveLoanHandler chain;

  public Card() {
    ApproveLoanHandler gold = new Gold();
    ApproveLoanHandler platinum = new Platinum();
    ApproveLoanHandler black = new Black();

    gold.setNext(platinum);
    platinum.setNext(black);

    chain = gold;  // Punto de partida.
  }

  public void creditCardRequest(int totalLoan) {
    chain.handleRequest(totalLoan);
  }
}
