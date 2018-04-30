package com.feralgoon;

public class Board
{
    private Peg pegOne;
    private Peg pegTwo;
    private Die dieOne;
    private Die dieTwo;

    public Board(Peg pegOne, Peg pegTwo, Die dieOne, Die dieTwo)
    {
        this.pegOne = pegOne;
        this.pegTwo = pegTwo;
        this.dieOne = dieOne;
        this.dieTwo = dieTwo;
    }

    public void playGame()
    {
        System.out.println("Starting Game");
        System.out.println();

        while (!pegOne.hasWon() && !pegTwo.hasWon())
        {
            showBoard();
            nextTurn();
        }

        endGame();
    }


    private void nextTurn()
    {
        dieOne.roll();
        dieTwo.roll();

        System.out.println();
        System.out.println("Turn starting for peg " + pegOne.getName());
        System.out.println("Dice for peg " + pegOne.getName() + " are " + dieOne.getValue() + " and " + dieTwo.getValue());

        if (dieOne.getValue() == pegOne.getNextPosition() || dieTwo.getValue() == pegOne.getNextPosition() ||
                dieOne.getValue() + dieTwo.getValue() == pegOne.getNextPosition())
        {
            pegOne.move();
        }

        dieOne.roll();
        dieTwo.roll();

        if (!pegOne.hasWon())
        {
            System.out.println();
            System.out.println("Turn starting for peg " + pegTwo.getName());
            System.out.println("Dice for peg " + pegTwo.getName() + " are " + dieOne.getValue() + " and " + dieTwo.getValue());

            if (dieOne.getValue() == pegTwo.getNextPosition() || dieTwo.getValue() == pegTwo.getNextPosition() ||
                    dieOne.getValue() + dieTwo.getValue() == pegTwo.getNextPosition())
            {
                pegTwo.move();
            }
        }


    }

    private void showBoard()
    {
        System.out.println();
        System.out.println("Peg " + pegOne.getName() + " is at position " + pegOne.getPosition());
        System.out.println("Peg " + pegTwo.getName() + " is at position " + pegTwo.getPosition());
    }

    private void endGame()
    {
        System.out.println();
        System.out.println("Game over!");
        showBoard();
        System.out.println();

        if (pegOne.hasWon())
        {
            System.out.println(pegOne.getName() + " has won!");
        }
        else
        {
            System.out.println(pegTwo.getName() + " has won!");

        }
    }

    public void reset()
    {
        pegOne.reset();
        pegTwo.reset();
    }
}
