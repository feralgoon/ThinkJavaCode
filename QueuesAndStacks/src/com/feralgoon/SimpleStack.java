package com.feralgoon;

import java.util.LinkedList;
import java.util.Stack;

public class SimpleStack
{
    public void run()
    {
        Stack<String> myStack = new Stack<>();

        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        myStack.push("Five");

        System.out.println(myStack);

        System.out.println(myStack.peek());
        System.out.println(myStack);

        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());

    }

    public static void main(String[] args)
    {
        SimpleStack simpleStack = new SimpleStack();
        simpleStack.run();
    }
}
