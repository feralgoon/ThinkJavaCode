package com.feralgoon;

public class PegTester
{
    public static void main(String[] args)
    {
        Peg peg = new Peg("Red");

        System.out.println(peg.getPosition());
        peg.move();
        System.out.println(peg.getPosition());
    }
}
