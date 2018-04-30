package com.feralgoon;

public class Peg
{
    int position;
    String name;

    public Peg(String name)
    {
        reset();
        this.name = name;
    }

    public void move()
    {
        position++;
    }

    public int getPosition()
    {
        return position;
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public String getName()
    {
        return name;
    }

    public boolean hasWon()
    {
        if (position == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void reset()
    {
        position = 1;
    }
}
