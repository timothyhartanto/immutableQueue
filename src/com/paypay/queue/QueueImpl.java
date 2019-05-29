package com.paypay.queue;

import java.util.LinkedList;

public final class QueueImpl<T> implements Queue {

  private final LinkedList<T> nodes;

  public QueueImpl() {
    this.nodes = new LinkedList<>();
  }

  public QueueImpl(LinkedList<T> nodes) {
    this.nodes = nodes;
  }

  @Override
  public Queue enQueue(Object o) {
    nodes.add((T)o);
    return new QueueImpl(nodes);
  }

  @Override
  public Queue deQueue() {
    nodes.pop();
    return new QueueImpl(nodes);
  }

  @Override
  public Object head() {
    return nodes.getFirst();
  }

  @Override
  public boolean isEmpty() {
    return nodes.isEmpty();
  }
}
