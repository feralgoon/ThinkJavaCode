package com.feralgoon;

public class Peg
{
    int position;

    public Peg()
    {
        position = 1;
    }

    public void move()

    {
        position++;
    }

    public int getPosition()

    {
        return position;
    }
}
