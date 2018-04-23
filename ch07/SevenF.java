import java.util.Scanner;

public class SevenF
{
    public static void main(String[] args)
    {
        getNumsAndSum();
    }

    private static void getNumsAndSum()
    {
        Scanner scan = new Scanner(System.in);
        int num;

        int sum = 0;

        System.out.println("Enter some numbers: ");

        do
        {
            num = scan.nextInt();
            sum += num;
        } while (sum < 1000);

        System.out.println("The total is: " + sum);
    }
}
