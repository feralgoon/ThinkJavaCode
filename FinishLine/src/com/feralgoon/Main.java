package com.feralgoon;

public class Main
{

    public static void main(String[] args)
    {
        Peg pegOne = new Peg();
        Peg pegTwo = new Peg();
        Die dieOne = new Die();
        Die dieTwo = new Die();

        Board finishLine = new Board(pegOne, pegTwo, dieOne, dieTwo);

        finishLine.playGame();
    }
}
