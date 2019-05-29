package com.paypay.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class QueueImpl<T> implements Queue {

  private final List<T> nodes;

  public QueueImpl() {
    this.nodes = new LinkedList<>();
  }

  public QueueImpl(List<T> nodes) {
    List<T> tempNode = new LinkedList<>();
    tempNode.addAll(nodes);
    this.nodes = Collections.unmodifiableList(tempNode);
  }

  @Override
  public Queue enQueue(Object o) {
    List<T> tempNode = new LinkedList<>();
    for (T t : nodes) {
      tempNode.add(t);
    }
    tempNode.add((T)o);
    return new QueueImpl(tempNode);
  }

  @Override
  public Queue deQueue() {
    List<T> tempNode = new LinkedList<>();
    if (!isEmpty()){
      tempNode.addAll(nodes);
      tempNode.remove(0);
      return new QueueImpl(tempNode);
    }
    return new QueueImpl();
  }

  @Override
  public Object head() {
    return nodes.get(0);
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
