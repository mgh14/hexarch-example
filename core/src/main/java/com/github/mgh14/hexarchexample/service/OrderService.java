package com.github.mgh14.hexarchexample.service;

import com.github.mgh14.hexarchexample.port.Persister;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class OrderService {

  private final Persister persistence;

  public Object filterOrdersInCoreBusinessLogic() {
    // TODO: implement here
    return null;
  }

  public Object filterOrdersInPersistenceInterface(Long userId, String orderId) {
    // TODO: implement in persistence class
    return null;
  }
}
