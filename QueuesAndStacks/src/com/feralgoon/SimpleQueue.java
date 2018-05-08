package com.feralgoon;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public void run()
    {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        String removed = myQueue.peek();
        System.out.println(removed);

        System.out.println(myQueue);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.peek());

        myQueue.peek();
    }

    public static void main(String[] args)
    {
        SimpleQueue simpleQueue = new SimpleQueue();
        simpleQueue.run();
    }
}
