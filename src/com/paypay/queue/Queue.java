package com.paypay.queue;

import java.util.List;

public interface Queue<T> {
  Queue<T> enQueue(T t);

  Queue<T> deQueue();

  T head();

  boolean isEmpty();

  List<T> print();
}
