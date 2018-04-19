import java.util.Scanner;

public class CheeseOrder
{
    public static void main(String[] args)
    {
        printHeader();
        promptUser();


        //This code moved to its own method, in order to utilize
        //recursion in case of invalid entry for diameter or yards.

        /*final int PRICE_ONE_INCH   = 2;
        final int PRICE_TWO_INCH   = 4;
        final int PRICE_THREE_INCH = 6;

        int diameter;
        int yards;

        Scanner in = new Scanner(System.in);

        printHeader();

        System.out.print("What diameter cheese would you like to order? ---> ");
        diameter = in.nextInt();
        in.nextLine();

        if ((diameter > 3) || (diameter < 1))
            System.out.println("Diameter is too crazy!");
        else
        {
            System.out.print("How many yards would you like to order?       ---> ");
            yards = in.nextInt();
            in.nextLine();

            if(yards < 0)
                System.out.println("Can't order that few yards!");
            else
            {
                if (diameter == 1)
                    getCost(diameter, yards, PRICE_ONE_INCH);
                else if (diameter == 2)
                    getCost(diameter, yards, PRICE_TWO_INCH);
                else
                    getCost(diameter, yards, PRICE_THREE_INCH);
            }
        }*/
    }

    private static void printHeader()
    {
        System.out.println("        Crazy Ed's Wholesale String Cheese   ");
        System.out.println("======================================================");
        System.out.println();
        System.out.println("      Diameter options: 1 inch, 2 inch, 3 inch");
        System.out.println("      Shipping: $2 per yard(1 inch and 2 inch)");
        System.out.println("                $4 per yard(3 inch)");
        System.out.println();
        System.out.println("             Free Shipping available! ");
        System.out.println("1 inch: 50 yards | 2 inch: 75 yards | 3 inch: 25 yards");
        System.out.println("======================================================");
        System.out.println();
        System.out.println();
    }

    private static void getCost(int diameter, int yards, int price)
    {
        int cost;

        if (diameter == 1)
        {
            if (yards > 50)
            {
                cost = price * yards;
            }
            else
            {
                cost = (price * yards) + (yards * 2);
            }
        }
        else if (diameter == 2)
        {
            if (yards > 75)
                cost = price * yards;
            else
                cost = (price * yards) + (yards * 2);
        }
        else
        {
            if (yards > 25)
                cost = price * yards;
            else
                cost = (price * yards) + (yards * 2);
        }

        cost += 5;

        System.out.println();
        System.out.println("The total price for the order is: $" + cost);
    }

    private static void promptUser()
    {
        final int PRICE_ONE_INCH   = 2;
        final int PRICE_TWO_INCH   = 4;
        final int PRICE_THREE_INCH = 6;

        int diameter;
        int yards;

        Scanner in = new Scanner(System.in);

        System.out.print("What diameter cheese would you like to order? ---> ");
        diameter = in.nextInt();
        in.nextLine();

        if ((diameter > 3) || (diameter < 1))
        {
            System.out.println("Diameter is too crazy!");
            System.out.println();
            promptUser();
        }
        else
        {
            System.out.print("How many yards would you like to order?       ---> ");
            yards = in.nextInt();
            in.nextLine();

            if(yards <= 0)
            {
                System.out.println("Can't order that few yards!");
                System.out.println();
                promptUser();
            }
            else
            {
                if (diameter == 1)
                    getCost(diameter, yards, PRICE_ONE_INCH);
                else if (diameter == 2)
                    getCost(diameter, yards, PRICE_TWO_INCH);
                else
                    getCost(diameter, yards, PRICE_THREE_INCH);
            }
        }
    }
}
