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

    public void startGame()
    {
        System.out.println("Welcome to Roundabout!");
        System.out.println("----------------------");
        showBoard();
    }

    public void reset()
    {
        pegOne.reset();
        pegTwo.reset();
    }

    public void nextTurn(Peg peg, Peg otherPeg)
    {
        dieOne.roll();
        dieTwo.roll();

        System.out.println();
        System.out.println("Dice rolls for peg " + peg.getName() + " are " +
                                dieOne.getValue() + " and " + dieTwo.getValue() + ".");

        if (dieOne.getValue() == peg.getNextPosition() ||
                dieTwo.getValue() == peg.getNextPosition() ||
                dieOne.getValue() + dieTwo.getValue() == peg.getNextPosition())
        {
            peg.move();
        }

        if (peg.getPosition() == otherPeg.getPosition())
        {
            otherPeg.reset();
        }

        showBoard();
    }

    public void endGame()
    {
        System.out.println();
        System.out.println("Game over!");
        System.out.println();

        if (pegOne.hasWon())
        {
            System.out.println("Peg " + pegOne.getName() + " has won!");
        }
        else
        {
            System.out.println("Peg " + pegTwo.getName() + " has won!");
        }
    }

    private void showBoard()
    {
        System.out.println();
        System.out.println("Peg " + pegOne.getName() + " is at position " + pegOne.getPosition());
        System.out.println("Peg " + pegTwo.getName() + " is at position " + pegTwo.getPosition());
    }
}
