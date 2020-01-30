package com.github.mgh14.hexarchexample.port;

import com.github.mgh14.hexarchexample.model.Order;

import java.util.List;

public interface Persister
{

  /**
   * TODO: document
   *
   * @param orderId
   * @param userId
   * @return
   */
  List<Order> getUserOrder(String orderId, long userId);
}
