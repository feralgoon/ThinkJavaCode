package com.feralgoon;

import java.util.Random;

public class Die
{
    private int value;
    private Random number = new Random();

    public Die()
    {
        roll();
    }

    public int getValue()
    {
        return value;
    }

    public void roll()
    {
        value = number.nextInt(6) + 1;
    }
}
