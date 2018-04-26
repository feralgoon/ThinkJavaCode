import java.util.Scanner;

public class VendingMaching
{
    public static void main(String[] args)
    {
        String[] items = {"Freeze Dried Sushi", "Spock's Brain Blast",
                "Alien Asparagus"};
        int[] sales = new int[items.length];
        Scanner scan = new Scanner(System.in);


        printMenu(items);
        getSelection(items, sales, scan);

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

    private static void printSales(String[] items, int[] sold, int selection, boolean array)
    {
        if (array)
        {
            System.out.println("You chose multiple items.");
        }
        else
        {
            sold[selection]++;

            System.out.println();
            System.out.println("Thank you for choosing " + items[selection]);
        }
        System.out.println("Sold so far: ");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(sold[i] + " of " + items[i]);
        }
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

    private static void getSelection(String[] items, int[] sales, Scanner scan)
    {
        int choice = scan.nextInt();
        scan.nextLine();

        int[] choiceArray = convertIntToArray(choice);

        if (choiceArray.length >= 2 && choiceArray[0] != 9 && choiceArray[1] != 9)
        {
            for(int i : sales)
            {
                if (choiceArray[i] == 9 && choiceArray[i+1] == 9)
                {
                    printFinalSales(items, sales);
                }
                else
                {
                    sales[i]++;
                }
            }
            printSales(items, sales, choice, true);
            printMenu(items);
            getSelection(items,sales,scan);
        }
        else
        {
            if (choice >= 0 && choice < items.length)
            {
                printSales(items, sales, choice, false);
                System.out.println();
                printMenu(items);
                getSelection(items, sales, scan);
            } else if (choice == 99)
            {
                printFinalSales(items, sales);
            } else
            {
                getSelection(items, sales, scan);
            }
        }
    }

    private static int[] convertIntToArray(int num)
    {
        String numValue = num + "";
        int[] result = new int[numValue.length()];

        for(int i = 0; i < numValue.length(); i++)
        {
            result[i] = numValue.charAt(i);
        }

    return result;
    }
}
