package com.paypay.queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class QueueImpl<T> implements Queue {

  private final T nodes[];

  public QueueImpl(T nodes[]) {
    if (nodes == null) {
      this.nodes = (T[]) Array.newInstance(Object.class, 0);
    } else {
      this.nodes = nodes;
    }
  }

  @Override
  public Queue enQueue(Object o) {
    if (Objects.nonNull(o)) {
      List<T> tempList = new ArrayList<>(Arrays.asList(this.nodes));
      tempList.add((T) o);
      return new QueueImpl(tempList.toArray());
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
    return isEmpty() ? new Object() : this.nodes[0];
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
