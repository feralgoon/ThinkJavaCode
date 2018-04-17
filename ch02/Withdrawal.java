public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal = 259;

        int twenties = withdrawal / 20;
        withdrawal %= 20;

        int tens = withdrawal / 10;
        withdrawal %= 10;

        int fives = withdrawal / 5;
        withdrawal %= 5;

        System.out.println("$20(" + twenties + "), $10(" + tens + "), $5(" + fives + "), $1(" + withdrawal + ")");
    }
}
