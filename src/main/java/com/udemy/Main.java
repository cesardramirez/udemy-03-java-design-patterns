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
import com.udemy.patterns.creational.prototype.PrototypeCard;
import com.udemy.patterns.creational.prototype.PrototypeFactory;
import com.udemy.patterns.creational.prototype.Visa;

import java.time.YearMonth;


public class Main {
  public static void main(String[] args) {
    //1. Factory Method.
    //testFactoryMethod();

    //2. Factory Method.
    //testAbstractFactory();

    //3. Builder.
    //testBuilder();

    //4. Prototype.
    //testPrototype();

    //5. Prototype.
    testSingleton();
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
                    .Builder("VISA", "4242 4242 4242 4242")
                    .holderName("César")
                    .expiration(YearMonth.of(2030, 12))
                    .credit(true)
                    .build();

    System.out.println(card1);

    com.udemy.patterns.creational.builder.Card card2 =
            new com.udemy.patterns.creational.builder.Card
                    .Builder("AMEX", "3400 0000 0000 0000")
                    .build();

    System.out.println(card2);
  }

  private static void testPrototype() {
    Visa visaClone = (Visa) PrototypeFactory.getInstance(com.udemy.patterns.creational.prototype.TypeCard.VISA);
    visaClone.setName("Visa clonada 9999");
    visaClone.showCard();

    PrototypeCard amexClone = PrototypeFactory.getInstance(com.udemy.patterns.creational.prototype.TypeCard.AMEX);
    amexClone.showCard();
  }

  private static void testSingleton() {
    com.udemy.patterns.creational.singleton.Card.getInstance().setCardNumber("1234 1234 1234 1234");
    System.out.println(com.udemy.patterns.creational.singleton.Card.getInstance().getCardNumber());
  }
}
