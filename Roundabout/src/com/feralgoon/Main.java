package com.feralgoon;

public class Main
{

    public static void main(String[] args)
    {
        Peg pegOne = new Peg("Red");
        Peg pegTwo = new Peg("Blue");
        Die dieOne = new Die();
        Die dieTwo = new Die();

        Board roundabout = new Board(pegOne, pegTwo, dieOne, dieTwo);

        roundabout.startGame();

        while (true)
        {
            roundabout.nextTurn(pegOne, pegTwo);

            if (pegOne.hasWon())
            {
                break;
            }

            roundabout.nextTurn(pegTwo, pegOne);

            if (pegTwo.hasWon())
            {
                break;
            }
        }

        roundabout.endGame();
    }
}
