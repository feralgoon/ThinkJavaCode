package com.feralgoon;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    private Queue<String> taskList = new LinkedList<>();

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

        } while (!choice.equalsIgnoreCase("EXIT"));

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
            peek(splitChoice);
        }
        else if (splitChoice[0].equalsIgnoreCase("Remove"))
        {
            remove(splitChoice);
        }
        else if (splitChoice[0].equalsIgnoreCase("HowMany"))
        {
            howMany();
        }
        else if (splitChoice[0].equalsIgnoreCase("Flee"))
        {
            flee();
        }
    }

    private void flee()
    {
        System.out.println("Packing bag...");
        System.out.println("Clearing task list...");
        System.out.println("Ready to flee country!");
    }

    private void howMany()
    {
        System.out.println("There are " + taskList.size() + " tasks left.");
    }

    private void remove(String[] choices)
    {
        if (choices.length == 1)
        {
            String removed = taskList.remove();
            System.out.println("Removed " + removed + " from the list.");
        }
        else
        {
            int num = getNum(choices[1]);

            for (int i = 0; i < num; i++)
            {
                System.out.println("Removed " + taskList.remove() + " from the list.");
                if (taskList.size() == 0)
                {
                    System.out.println("List empty!");
                    return;
                }
            }
        }
        System.out.println("Next task is: " + taskList.peek());
    }

    private int getNum(String s)
    {
        int result = 0;
        try
        {
            result =  Integer.parseInt(s);
        } catch (Exception e)
        {
            System.out.println("Invalid number of tasks.");
        }
        return result;
    }

    private void peek(String[] choices)
    {

        if (choices.length == 1)
        {
            System.out.println(taskList.peek());
        }
        else
        {
            int num = getNum(choices[1]);
            Iterator itr = taskList.iterator();
            int index = 1;
            System.out.println("Viewing " + num + " tasks.");
            while (itr.hasNext() && index <= num)
            {
                System.out.println(itr.next());
                index++;
            }

        }
    }

    private void add(String[] taskList)
    {
        if (taskList.length < 2)
        {
            System.out.println("Error: No task(s) Specified");
        }
        else
        {
            for (int i = 1; i < taskList.length; i++)
            {
                this.taskList.add(taskList[i]);
                System.out.println("Added " + taskList[i] + " to list");
            }
        }
    }

    private void printOptions()
    {
        System.out.println();
        System.out.println("Options: ");
        System.out.println();
        System.out.println("Add <Task Name>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Flee");
        System.out.println("Exit");
        System.out.println();
    }

    private void printHeader()
    {
        System.out.println("===============");
        System.out.println("|| Task List ||");
        System.out.println("===============");
    }

    public static void main(String[] args)
    {
        TaskHelper taskHelper = new TaskHelper();
        taskHelper.run();
    }
}
