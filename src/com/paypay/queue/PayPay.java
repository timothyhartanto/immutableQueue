package com.paypay.queue;

import java.util.LinkedList;

public class PayPay {
  public static void main(String args[]) {
    LinkedList<String> list = new LinkedList<>();
    list.add("hahah");

    QueueImpl<String> test = new QueueImpl<>(list);

    test.enQueue("wakakakak");
    System.out.println(test.head());
    test.deQueue();
    System.out.println(test.head());
    test.enQueue("cccccc");
    System.out.println(test.head());
    test.deQueue();
    System.out.println(test.head());
    test.deQueue();
    System.out.println(test.head());
  }
}
