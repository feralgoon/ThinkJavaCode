import java.util.Scanner;

public class CoffeDiscounts
{
    public static void main(String[] args)
    {
        int commute;
        int busOrBike;
        Scanner scan = new Scanner(System.in);

        printHeader();

        System.out.print("Please enter the distance of the commute: ------> ");
        commute = scan.nextInt();
        scan.nextLine();
        System.out.println();

        System.out.print("Please enter a 1 for bicycle, and a 2 for bus: ->");
        busOrBike = scan.nextInt();
        scan.nextLine();
        System.out.println();

        findDiscounts(commute, busOrBike);

    }

    private static void printHeader()
    {
        System.out.println("Green Coffee Growers of Antarctica");
        System.out.println("    Discount Check Software");
        System.out.println("==================================");
        System.out.println();
    }

    private static void findDiscounts(int commute, int busOrBike)
    {
        String result = "You get-----> ";
        int discount;

        if (commute < 21)
            result += "a free coffee: ";
        if(busOrBike == 1)
        {
            if ((commute >= 30) && ( commute < 50))
                result += "20% discount. ";
            else if (commute < 50)
                result += "30% discount.";
            else
                result += "No discount";
        }
        else if (busOrBike == 2)
        {
            if ((commute >=35) && (commute < 50))
                result += "50% discount.";
            else if (commute > 35)
                result += "30% discount.";
            else
                result += "No discount.";
        }
        System.out.println(result);
    }
}