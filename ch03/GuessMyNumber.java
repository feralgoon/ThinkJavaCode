import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        int guess,number, diff;
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?");
        System.out.println("Type a  number: ");

        guess = in.nextInt();
        diff = Math.abs(guess - number);

        System.out.printf("Your guess is: %d", guess);
        System.out.printf("\nThe number I was thinking of is: %d", number);
        System.out.printf("\nYou were off by: %d", diff);

    }
}
