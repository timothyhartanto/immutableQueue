package com.paypay.queue;

import java.util.LinkedList;

public class PayPay {
  public static void main(String args[]) {
    LinkedList<String> list = new LinkedList<>();
    list.add("string1");
    list.add("string2");

    Queue<String> queue1 = new QueueImpl<>(list);
    Queue<String> queue2 = queue1;

    Queue queue3 = queue2.enQueue("string3");

    System.out.println(queue1.print());
    queue1 = queue1.deQueue();
    System.out.println(queue1.print());
    System.out.println(queue2.print());
    System.out.println(queue3.print());
  }
}
