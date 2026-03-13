package com.udemy.patterns.behavioral.chainofresponsibility;

public abstract class AbstractApproveLoanHandler implements ApproveLoanHandler {

  protected ApproveLoanHandler next;

  @Override
  public void setNext(ApproveLoanHandler next) {
    this.next = next;
  }

  protected void nextHandler(int totalLoan) {
    if (next != null) {
      next.handleRequest(totalLoan);
    } else {
      System.out.println("No existe tarjeta para aprobar el préstamo");
    }
  }
}
