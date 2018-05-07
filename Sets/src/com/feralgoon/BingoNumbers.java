package com.feralgoon;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BingoNumbers
{
    private String[] choices;
    Set<Integer> bingoNums = new HashSet<>(75);

    private void run()
    {
        Scanner scan = new Scanner(System.in);
        String choice;

        printHeader();

        System.out.println(bingoNums);

        do
        {
            printOptions();
            choice = scan.nextLine();
            handleChoices(choice);

        } while (!choices[0].equalsIgnoreCase("Exit"));

    }

    private void handleChoices(String choice)
    {
        choices = choice.split(" ");

        try
        {
            if (choices[0].equalsIgnoreCase("Call"))
            {
                call();
            }
            else if (choices[0].equalsIgnoreCase("Called"))
            {
                calledNums();
            }
            else if (choices[0].equalsIgnoreCase("ToGo"))
            {
                toGo();
            }
            else if (choices[0].equalsIgnoreCase("Verify"))
            {
                verifyNums();
            }
            else if (choices[0].equalsIgnoreCase("Challenge"))
            {
                challenge();
            }
            else if (choices[0].equalsIgnoreCase("Bingo"))
            {
                bingo();
            }
        } catch (Exception e)
        {
            System.out.println("Invalid Entry.");
            System.out.println(e.getLocalizedMessage());
            System.out.println();
        }
    }

    private String appendLetter(int num)
    {
        String result = "";

        if (num <= 15)
        {
            result += "B";
        }
        else if (num <= 30)
        {
            result += "I";
        }
        else if (num <= 45)
        {
            result += "N";
        }
        else if (num <= 60)
        {
            result += "G";
        }
        else if (num <= 75)
        {
            result += "O";
        }

        result += num;
        return result;
    }

    private void toGo()
    {
        Set<Integer> numsToGo = new HashSet<>(75);

        for(int i = 1; i <= 75; i++)
        {
            numsToGo.add(i);
        }

        numsToGo.removeAll(bingoNums);

        System.out.println("The following numbers remain: ");
        for(int i : numsToGo)
        {
            System.out.println(appendLetter(i));
        }
    }

    private void bingo()
    {
        if (bingoNums.size() < 5)
        {
            System.out.println("CHEATER!");
        }
        else
        {
            System.out.println("Congratulations, you win an fruit cake!");
            bingoNums.clear();
        }

    }

    private void challenge()
    {
        int num = Integer.parseInt(choices[1]);

        if (num < 1 || num > 75)
        {
            throw new IllegalArgumentException("Number to challenge must be between 1 and 75.");
        }
        else if (bingoNums.remove(num))
        {
            System.out.println(appendLetter(num) + " was removed from the called list.");
        }
        else
        {
            System.out.println(appendLetter(num) + " hasn't been called!");
        }
    }

    private void verifyNums()
    {
        int num = Integer.parseInt(choices[1]);
        System.out.println();

        if (num < 1 || num > 75)
        {
            throw new IllegalArgumentException("Number to verify must be between 1 and 75.");
        }
        else if (bingoNums.contains(num))
        {
            System.out.println(appendLetter(num) + " has been called.");
        }
        else
        {
            System.out.println(appendLetter(num) + " has NOT been called.");
        }

    }

    private void calledNums()
    {
        System.out.println();
        if (bingoNums.size() == 0)
        {
            System.out.println("No numbers have been called.");
        }
        else
        {
            System.out.println("The following numbers have been called: ");

            for(int i : bingoNums)
            {
                System.out.println(appendLetter(i));
            }
        }
    }

    private void call()
    {
        System.out.println();

        if (choices.length == 1)
        {
            Random randNum = new Random();
            int randomNumber = randNum.nextInt(74) + 1;

            while(bingoNums.contains(randomNumber))
            {
                randomNumber = randNum.nextInt(74) + 1;
            }

            bingoNums.add(randomNumber);
            System.out.println("Called " + appendLetter(randomNumber));
        }
        else
        {
            int num = Integer.parseInt(choices[1]);

            if (num < 1 || num > 75)
            {
                throw new IllegalArgumentException("Called number must be between 1 and 75.");
            }
            else if (bingoNums.add(num))
            {
                System.out.println("Called " + appendLetter(num));
            }
            else
            {
                System.out.println("Number already called!");
            }
        }
    }

    private void printOptions()
    {
        System.out.println();
        System.out.println("Choose from the following: ");
        System.out.println();
        System.out.println("Call <1-75>");
        System.out.println("Called");
        System.out.println("ToGo");
        System.out.println("Verify <1-75>");
        System.out.println("Challenge <1-75>");
        System.out.println("Bingo");
        System.out.println("Exit");
        System.out.println();
        System.out.print("Enter Selection: --->  ");
    }

    private void printHeader()
    {
        System.out.println();
        System.out.println("=======================");
        System.out.println("|| Welcome to Bingo! ||");
        System.out.println("=======================");
        System.out.println();
    }


    public static void main(String[] args)
    {
        BingoNumbers bingoNumbers = new BingoNumbers();

        bingoNumbers.run();
    }
}
