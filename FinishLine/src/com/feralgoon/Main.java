package com.feralgoon;

public class Main
{

    public static void main(String[] args)
    {
        Peg pegOne = new Peg("Red");
        Peg pegTwo = new Peg("Blue");
        Die dieOne = new Die();
        Die dieTwo = new Die();

        Board finishLine = new Board(pegOne, pegTwo, dieOne, dieTwo);

        for(int i = 0; i < 100; i++)
        {
            finishLine.playGame();
            finishLine.reset();
        }
    }
}
