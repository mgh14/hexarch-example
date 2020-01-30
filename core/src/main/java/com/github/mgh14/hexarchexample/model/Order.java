package com.github.mgh14.hexarchexample.model;

import lombok.Value;

@Value
public class Order {
  String id;
  long timestamp;
  long userId;
}
