package com.paypay.queue;

import java.util.ArrayList;
import java.util.List;

public class PayPay {
  public static void main(String args[]) {
    List<String> list = new ArrayList<>();
    list.add("a");

    Queue q = new QueueImpl(null);
    System.out.println("q print null : " + q.head());

    q = new QueueImpl();
    System.out.println("q print empty list : " +  q.print());

    System.out.println();

    Queue q1 = new QueueImpl(list);
    System.out.println("q1 print a : " + q1.print());

    System.out.println();

    q1 = q1.enQueue("b");
    System.out.println("q1 print a, b : " + q1.print());

    Queue q2 = q1.enQueue("c");
    System.out.println("q1 print a, b : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());

    System.out.println();

    Queue q3 = q2.enQueue("d");
    System.out.println("q1 print a, b : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());
    System.out.println("q3 print a, b, c, d : " + q3.print());

    System.out.println();

    Queue q4 = q3.deQueue();
    System.out.println("q1 print a, b : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());
    System.out.println("q3 print a, b, c, d : " + q3.print());
    System.out.println("q4 print b, c, d : " + q4.print());

    System.out.println();

    q3 = q3.deQueue();
    q3 = q3.deQueue();
    q3 = q3.deQueue();
    System.out.println("q1 print a, b : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());
    System.out.println("q3 print d : " + q3.print());
    System.out.println("q4 print b, c, d : " + q4.print());

    System.out.println();

    q1 = q1.deQueue();
    q1 = q1.deQueue();
    System.out.println("q1 print empty list : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());
    System.out.println("q3 print d : " + q3.print());
    System.out.println("q4 print b, c, d : " + q4.print());

    System.out.println();

    q4 = q4.deQueue();
    q4 = q4.deQueue();
    q4 = q4.deQueue();
    q4 = q4.deQueue();
    System.out.println("q1 print empty list : " + q1.print());
    System.out.println("q2 print a, b, c : " + q2.print());
    System.out.println("q3 print d : " + q3.print());
    System.out.println("q4 print empty list : " + q4.print());

    System.out.println();

    q1 = q1.enQueue(null);
    System.out.println("q1 print empty list : " + q1.print());
    System.out.println("q1 print null : " + q1.head());
    System.out.println("q1 print true : " + q1.isEmpty());

    q1.enQueue("a");
    System.out.println("q1 print empty list : " + q1.print());
    
    q1 = q1.enQueue("x");
    System.out.println("q1 print x : " + q1.head());
  }
}
