package com.mlucov.lambda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
  boolean isPaid;
  String name;
  public Order(boolean paid, String givenName) {
      isPaid = paid;
      name = givenName;
  }
}
