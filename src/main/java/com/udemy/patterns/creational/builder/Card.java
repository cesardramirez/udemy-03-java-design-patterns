package com.udemy.patterns.creational.builder;

public class Card {
  private final String cardType;
  private final String number;
  private final String name;
  private final int expiration;
  private final boolean credit;

  private Card(CardBuilder builder) {
    this.cardType = builder.cardType;
    this.number = builder.number;
    this.name = builder.name;
    this.expiration = builder.expiration;
    this.credit = builder.credit;
  }

  public String getCardType() {
    return cardType;
  }

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public int getExpiration() {
    return expiration;
  }

  public boolean isCredit() {
    return credit;
  }

  @Override
  public String toString() {
    return "Card{" +
            "cardType='" + cardType + '\'' +
            ", number='" + number + '\'' +
            ", name='" + name + '\'' +
            ", expiration=" + expiration +
            ", credit=" + credit +
            '}';
  }

  public static class CardBuilder {
    private final String cardType;
    private final String number;
    private String name;
    private int expiration;
    private boolean credit;

    public CardBuilder(String cardType, String number) {
      this.cardType = cardType;
      this.number = number;
    }

    public CardBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CardBuilder expiration(int expiration) {
      this.expiration = expiration;
      return this;
    }

    public CardBuilder credit(boolean credit) {
      this.credit = credit;
      return this;
    }

    public Card build() {
      return new Card(this);
    }
  }
}
