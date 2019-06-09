package com.paypay.queue;

import java.util.Arrays;

public class PayPay {
  public static void main(String args[]) {
    String[] arr = {"a"};

    Queue q = new QueueImpl(arr);
    System.out.println("q print a : " + q.head());

    q = q.enQueue("b");
    System.out.println("q print a, b : " + q.print());
    System.out.println("arr print a : " + Arrays.toString(arr));

    System.out.println();

    q = q.deQueue();
    System.out.println("q print b : " + q.print());
    System.out.println("q print b : " + q.head());

    q = q.deQueue();
    System.out.println("q print true : " + q.isEmpty());
    System.out.println("q print [] : " + q.print());
    System.out.println();

    String[] arrString = {"a", "b", "c", "d"};
    q = new QueueImpl(arrString);
    System.out.println("q print a, b, c, d : " + q.print());

    System.out.println();

    q.deQueue();
    q.deQueue();
    System.out.println("q print a, b, c, d : " + q.print());

    q = q.deQueue();
    System.out.println("q print b, c, d : " + q.print());

    System.out.println();

    q.enQueue("e");
    q.enQueue("f");
    System.out.println("q print b, c, d : " + q.print());

    q = q.enQueue("e");
    q = q.enQueue("f");
    System.out.println("q print b, c, d, e, f : " + q.print());

    System.out.println();

    q = q.enQueue(null);
    System.out.println("q print b, c, d, e, f : " + q.print());

    arr = new String[0];
    q = new QueueImpl(arr);
    q = q.enQueue("x");
    System.out.println("q print x : " + q.print());

    q = new QueueImpl(null);
    q = q.enQueue("z");
    System.out.println("q print z : " + q.print());
  }
}
