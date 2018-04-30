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

        showBoard();
    }

    public void playGame()
    {
        while (pegOne.getPosition() != 10 && pegTwo.getPosition() != 10)
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
        System.out.println("Turn starting for peg one. ");
        System.out.println("Dice for peg one are " + dieOne.getValue() + " and " + dieTwo.getValue());

        if (dieOne.getValue() == pegOne.getPosition() + 1 || dieTwo.getValue() == pegOne.getPosition() + 1 ||
                dieOne.getValue() + dieTwo.getValue() == pegOne.getPosition() + 1)
        {
            pegOne.move();
        }

        dieOne.roll();
        dieTwo.roll();

        if (pegOne.getPosition() != 10)
        {
            System.out.println();
            System.out.println("Turn starting for peg two. ");
            System.out.println("Dice for peg two are " + dieOne.getValue() + " and " + dieTwo.getValue());

            if (dieOne.getValue() == pegTwo.getPosition() + 1 || dieTwo.getValue() == pegTwo.getPosition() + 1 ||
                    dieOne.getValue() + dieTwo.getValue() == pegTwo.getPosition() + 1)
            {
                pegTwo.move();
            }
        }


    }

    private void showBoard()
    {
        System.out.println();
        System.out.println("Peg one is at position " + pegOne.getPosition());
        System.out.println("Peg two is at position " + pegTwo.getPosition());
    }

    private void endGame()
    {
        System.out.println();
        System.out.println("Game over!");
        showBoard();
    }
}
