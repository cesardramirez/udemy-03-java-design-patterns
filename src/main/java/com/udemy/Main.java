package com.udemy;

import com.udemy.patterns.creational.abstractfactory.FactoryProvider;
import com.udemy.patterns.creational.abstractfactory.TypeCard;
import com.udemy.patterns.creational.abstractfactory.TypePaymentMethod;
import com.udemy.patterns.creational.abstractfactory.factory.AbstractFactory;
import com.udemy.patterns.creational.abstractfactory.factory.CardFactory;
import com.udemy.patterns.creational.abstractfactory.factory.PaymentMethodFactory;
import com.udemy.patterns.creational.abstractfactory.product.Card;
import com.udemy.patterns.creational.abstractfactory.product.PaymentMethod;
import com.udemy.patterns.creational.factorymethod.Payment;
import com.udemy.patterns.creational.factorymethod.PaymentFactory;
import com.udemy.patterns.creational.factorymethod.TypePayment;


public class Main {
  public static void main(String[] args) {
    //1. Factory Method.
    //testFactoryMethod();

    //2. Factory Method.
    //testAbstractFactory();

    //3. Builder.
    testBuilder();
  }

  private static void testFactoryMethod() {
    Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
    payment.doPayment();
  }

  private static void testAbstractFactory() {
    AbstractFactory<Card> concreteFactory1 = FactoryProvider.getFactory(CardFactory::new);
    Card productA1 = concreteFactory1.create(TypeCard.VISA.toString());

    AbstractFactory<PaymentMethod> concreteFactory2 = FactoryProvider.getFactory(PaymentMethodFactory::new);
    PaymentMethod productB2 = concreteFactory2.create(TypePaymentMethod.CREDIT.toString());

    System.out.println("Tarjeta de crédito " + productA1.getCardType() + " con número " + productA1.getNumber() + " de tipo " + productB2.doPayment());
  }

  private static void testBuilder() {
    com.udemy.patterns.creational.builder.Card card1 =
            new com.udemy.patterns.creational.builder.Card
                    .CardBuilder("VISA", "4242 4242 4242 4242")
                    .name("César")
                    .expiration(2030)
                    .credit(true)
                    .build();

    System.out.println(card1);

    com.udemy.patterns.creational.builder.Card card2 =
            new com.udemy.patterns.creational.builder.Card
                    .CardBuilder("AMEX", "3400 0000 0000 0000")
                    .build();

    System.out.println(card2);
  }
}
