package com.paypay.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class QueueImpl<T> implements Queue {

  private final List<T> nodes;

  public QueueImpl() {
    this.nodes = new ArrayList<>();
  }

  public QueueImpl(List<T> nodes) {
    if (nodes != null && !nodes.isEmpty()) {
      List<T> tempNode = new ArrayList<>();
      tempNode.addAll(nodes);
      this.nodes = tempNode;
    } else {
      this.nodes = new ArrayList<>();
    }
  }

  @Override
  public Queue enQueue(Object o) {
    if (Objects.nonNull(o)) {
      List<T> tempNode = new ArrayList<>();
      tempNode.addAll(nodes);
      tempNode.add((T) o);
      return new QueueImpl(tempNode);
    }
    return new QueueImpl();
  }

  @Override
  public Queue deQueue() {
    List<T> tempNode = new ArrayList<>();
    if (!isEmpty()) {
      tempNode.addAll(nodes);
      tempNode.remove(0);
      return new QueueImpl(tempNode);
    }
    return new QueueImpl();
  }

  @Override
  public Object head() {
    return isEmpty() ? null : nodes.get(0);
  }

  @Override
  public boolean isEmpty() {
    return nodes.isEmpty();
  }

  @Override
  public List<T> print() {
    return nodes;
  }
}
