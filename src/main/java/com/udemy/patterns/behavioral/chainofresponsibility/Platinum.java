package com.udemy.patterns.behavioral.chainofresponsibility;

/**
 * ConcreteHandler2: Platinium
 */
public class Platinum implements ApproveLoanChain {

  private ApproveLoanChain next;

  @Override
  public void setNext(ApproveLoanChain loan) {
    next = loan;
  }

  @Override
  public ApproveLoanChain getNext() {
    return next;
  }

  @Override
  public void creditCardRequest(int totalLoan) {
    System.out.println("Platinum credit card validation");
    if (totalLoan > 10000 && totalLoan <= 50000) {
      // Código para conceder la tarjeta de crédito con sus condiciones.
      System.out.println("[*] Solicitud de TC para tarjeta Platinum aprobada");
    } else {
      // Si la cantidad es mayor a 50 mil, se pasará la solicitud a la siguiente tarjeta.
      next.creditCardRequest(totalLoan);
    }
  }
}
