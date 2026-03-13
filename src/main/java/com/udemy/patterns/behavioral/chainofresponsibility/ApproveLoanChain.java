package com.udemy.patterns.behavioral.chainofresponsibility;

/**
 * Handler: ApproveLoanChain
 */
public interface ApproveLoanChain {
  void setNext(ApproveLoanChain loan);

  ApproveLoanChain getNext();

  void creditCardRequest(int totalLoan);
}
