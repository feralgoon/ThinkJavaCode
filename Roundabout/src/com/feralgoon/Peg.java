package com.feralgoon;

public class Peg
{
    private int position;
    private String name;

    public Peg(String name)
    {
        position = 0;
        this.name = name;
    }

    public void move()
    {
        position++;
    }

    public void reset()
    {
        position = 0;
    }

    public int getPosition()
    {
        return position;
    }

    public int getNextPosition()
    {
        if (position == 0)
        {
            return 5;
        }
        else
        {
            return position + 1;
        }
    }

    public String getName()
    {
        return name;
    }

    public boolean hasWon()
    {
        return position >= 12;
    }
}
