import java.util.Scanner;

public class SevenE
{
    public static void main(String[] args)
    {
        loopUntilZero();
    }

    private static void loopUntilZero()
    {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter a number: ");

        do
        {
            num = scan.nextInt();
        } while (num != 0);

        System.out.println("Finally, you entered zero.");
    }
}
