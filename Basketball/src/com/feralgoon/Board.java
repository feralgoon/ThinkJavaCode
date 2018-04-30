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
        System.out.println("Welcome to Basketball!");
        System.out.println("----------------------");
        showBoard();
    }

    public void reset()
    {
        pegOne.reset();
        pegTwo.reset();
    }

    public void nextTurn(Peg peg)
    {
        dieOne.roll();
        dieTwo.roll();

        peg.move(findPointValue(dieOne.getValue() + dieTwo.getValue()));

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
        System.out.println("Peg " + pegOne.getName() + " has " + pegOne.getPosition() + " points.");
        System.out.println("Peg " + pegTwo.getName() + " has " + pegTwo.getPosition() + " points.");
    }

    private int findPointValue(int value)
    {
        int result;

        switch (value)
        {
            case 2: case 12:
                System.out.println("Three point shot!");
                result = 3;
                break;
            case 3:
                System.out.println("Walking violation!");
                result = 0;
                break;
            case 4: case 6:
                System.out.println("Two point shot!");
                result = 2;
                break;
            case 5:
                System.out.println("Foul Shot! One point!");
                result = 1;
                break;
            case 7:
                System.out.println("Double Dribble!");
                result = 0;
                break;
            case 8:
                System.out.println("Two foul shots! Two points!");
                result = 2;
                break;
            case 9:
                System.out.println("Missed shot!");
                result = 0;
                break;
            case 10:
                System.out.println("Three foul shots! Three Points!");
                result = 3;
                break;
            case 11:
                System.out.println("Offensive Foul!");
                result = 0;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
