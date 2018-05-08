package com.feralgoon;

import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{
    private Stack<String> emergencies = new Stack<>();

    public void run()
    {
        Scanner scan = new Scanner(System.in);
        String choice;

        printHeader();

        do
        {
            printOptions();

            System.out.print("Enter command ---> ");
            choice = scan.nextLine();
            handleChoice(choice);

        }while (!choice.equalsIgnoreCase("EXIT"));

    }

    private void handleChoice(String choice)
    {
        String[] splitChoice = choice.split(" ");

        if (splitChoice[0].equalsIgnoreCase("Add"))
        {
            add(splitChoice);
        }
        else if (splitChoice[0].equalsIgnoreCase("Peek"))
        {
            peek();
        }
        else if (splitChoice[0].equalsIgnoreCase("Remove"))
        {
            remove();
        }
        else if (splitChoice[0].equalsIgnoreCase("HowMany"))
        {
            howMany();
        }
        else if (splitChoice[0].equalsIgnoreCase("Panic"))
        {
            panic();
        }
    }

    private void panic()
    {
        System.out.println("Packing bag...");
        System.out.println("Clearing emergency list...");
        System.out.println("Ready to flee country!");
    }

    private void howMany()
    {
        System.out.println("There are " + emergencies.size() + " emergencies left.");
    }

    private void remove()
    {
        String removed = emergencies.pop();
        System.out.println("Removed " + removed + " from the list.");
        System.out.println("Next task is: " + emergencies.peek());
    }

    private void peek()
    {
        System.out.println(emergencies.peek());
    }

    private void add(String[] taskList)
    {
        if (taskList.length < 2)
        {
            System.out.println("Error: No emergency specified.");
        }
        else
        {
            this.emergencies.add(taskList[1]);
        }
    }

    private void printOptions()
    {
        System.out.println();
        System.out.println("Options: ");
        System.out.println();
        System.out.println("Add <Emergency Name>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Panic");
        System.out.println("Exit");
        System.out.println();
    }

    private void printHeader()
    {
        System.out.println("====================");
        System.out.println("|| Emergency List ||");
        System.out.println("====================");
    }
    public static void main(String[] args)
    {
        EmergencyTracker emergencyTracker = new EmergencyTracker();
        emergencyTracker.run();
    }
}
