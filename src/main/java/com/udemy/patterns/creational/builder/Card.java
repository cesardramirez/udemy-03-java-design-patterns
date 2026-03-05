package com.udemy.patterns.creational.builder;

import java.time.YearMonth;
import java.util.Objects;

public class Card {
  private final String cardType;
  private final String number;
  private final String holderName;
  private final YearMonth expiration;
  private final boolean credit;

  private Card(Builder builder) {
    this.cardType = builder.cardType;
    this.number = builder.number;
    this.holderName = builder.holderName;
    this.expiration = builder.expiration;
    this.credit = builder.credit;
  }

  public String getCardType() {
    return cardType;
  }

  public String getNumber() {
    return number;
  }

  public String getHolderName() {
    return holderName;
  }

  public YearMonth getExpiration() {
    return expiration;
  }

  public boolean isCredit() {
    return credit;
  }

  @Override
  public String toString() {
    return String.format(
            "Card[type=%s, number=%s, holder=%s, expiration=%s, credit=%s]",
            cardType, number, holderName, expiration, credit
    );
  }

  // ======= BUILDER =========
  public static class Builder {
    private final String cardType;
    private final String number;

    private String holderName;
    private YearMonth expiration;
    private boolean credit;

    public Builder(String cardType, String number) {
      this.cardType = Objects.requireNonNull(cardType, "cardType is required");
      this.number = Objects.requireNonNull(number, "number is required");
    }

    public Builder holderName(String holderName) {
      this.holderName = holderName;
      return this;
    }

    public Builder expiration(YearMonth expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder credit(boolean credit) {
      this.credit = credit;
      return this;
    }

    public Card build() {
      validate();
      return new Card(this);
    }

    // Additional method
    private void validate() {
      if (number.length() < 12 || number.length() > 19) {
        throw new IllegalArgumentException("Card number length is invalid");
      }

      if (expiration != null && expiration.isBefore(YearMonth.now())) {
        throw new IllegalStateException("Card is expired");
      }
    }
  }
}
