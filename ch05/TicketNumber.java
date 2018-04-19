import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args)
    {
        int ticketNumber;
        Scanner in = new Scanner(System.in);

        printHeader();

        System.out.print("Please enter the ticket number: ");
        ticketNumber = in.nextInt();
        in.nextLine();

        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;

        boolean result = ((ticketPrefix % 7) == lastDigit);

        if (result)
            System.out.println("Good Number");
        else
            System.out.println("Bad number");
    }

    private static void printHeader()
    {
        System.out.println("Travel Tickets Company Ticket Checking Software");
        System.out.println("===============================================");
        System.out.println();
    }
}
