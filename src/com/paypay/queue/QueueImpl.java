package com.paypay.queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public final class QueueImpl<T> implements Queue {

  private final T nodes[];

  public QueueImpl(T nodes[]) {
    this.nodes = nodes;
  }

  @Override
  public Queue enQueue(Object o) {
    if (Objects.nonNull(o)) {
      T tempNodes[] = (T[]) Array.newInstance(o.getClass(), this.nodes.length + 1);
      System.arraycopy(this.nodes, 0, tempNodes, 0, this.nodes.length);
      tempNodes[this.nodes.length] = (T) o;
      return new QueueImpl(tempNodes);
    }
    return new QueueImpl(this.nodes);
  }

  @Override
  public Queue deQueue() {
    if (!isEmpty()) {
      T tempNode[] = Arrays.copyOfRange(this.nodes, 1, this.nodes.length);
      return new QueueImpl(tempNode);
    }
    return new QueueImpl(this.nodes);
  }

  @Override
  public Object head() {
    return isEmpty() ? null : this.nodes[0];
  }

  @Override
  public boolean isEmpty() {
    return this.nodes == null || this.nodes.length == 0;
  }

  @Override
  public String print() {
    return Arrays.toString(this.nodes);
  }
}
