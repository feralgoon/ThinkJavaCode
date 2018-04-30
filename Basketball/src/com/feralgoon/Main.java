package com.feralgoon;

public class Main
{

    public static void main(String[] args)
    {
        Peg pegOne = new Peg("Red");
        Peg pegTwo = new Peg("Blue");
        Die dieOne = new Die();
        Die dieTwo = new Die();

        Board basketball = new Board(pegOne,pegTwo,dieOne,dieTwo);

        basketball.startGame();

        while(true)
        {
            System.out.println();
            System.out.println("Peg " + pegOne.getName() + " turn!");

            basketball.nextTurn(pegOne);

            if (pegOne.hasWon())
            {
                break;
            }

            System.out.println();
            System.out.println("Peg " + pegTwo.getName() + " turn!");

            basketball.nextTurn((pegTwo));

            if (pegTwo.hasWon())
            {
                break;
            }
        }

        basketball.endGame();
    }
}
