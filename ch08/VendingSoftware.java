import java.util.Scanner;

public class VendingSoftware
{
    public static void main(String[] args)
    {
        String[] items = {"Freeze Dried Sushi", "Spock's Brain Blast",
                "Alien Asparagus"};
        int[] sales = new int[items.length];
        Scanner scan = new Scanner(System.in);
        String choice;
        boolean keepGoing = true;


        do
        {
            printMenu(items);
            choice = scan.nextLine();

            int[] choices = convertToArray(choice);
            if (choices.length == 1)
            {
                printSales(items, sales, choices[0]);
            }
            else
            {
                for (int i = 0; i < choices.length - 1; i++)
                {
                    if (choices[i] == 0)
                    {
                        sales[0]++;
                    }
                    else if (choices[i] == 1)
                    {
                        sales[1]++;
                    }
                    else if (choices[i] == 2)
                    {
                        sales[2]++;
                    }
                    else if (choices[i] == 9 && choices[i + 1] == 9)
                    {
                        keepGoing = false;
                    }
                }
                if (choices[0] == 0)
                {
                    sales[0]++;
                }
                else if (choices[0] == 1)
                {
                    sales[1]++;
                }
                else if (choices[0] == 2)
                {
                    sales[2]++;
                }
            }

        } while (keepGoing);

    }

    private static void printMenu(String[] names)
    {
        System.out.println("Please select from: ");

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(i + ")\t" + names[i]);
        }
        System.out.print("Your selection: ");
    }

    private static void printFinalSales(String[] items, int[] sold)
    {
        System.out.println();
        System.out.println("Final Sales Totals: ");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(sold[i] + " of " + items[i]);
        }
        System.out.println("Goodbye!");
    }

    private static void printSales(String[] items, int[] sold, int selection)
    {
        sold[selection]++;

        System.out.println();
        if (selection == -1)
        {
            System.out.println("Thank you for choosing multiple items!");
        }
        else
        {
            System.out.println("Thank you for choosing " + items[selection]);
        }
        System.out.println("Sold so far: ");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(sold[i] + " of " + items[i]);
        }
    }

    private static int[] convertToArray(int num)
    {
        String numValue = num + "";
        int[] result = new int[numValue.length()];

        for (int i = 0; i < numValue.length(); i++)
        {
            result[i] = numValue.charAt(i);
        }

        return result;
    }

    private static int[] convertToArray(String str)
    {
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
        {
            result[i] = str.charAt(i);
        }

        return result;
    }
}
