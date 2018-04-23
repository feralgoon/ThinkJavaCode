public class SevenD
{
    public static void main(String[] args)
    {
        countToInt(56);
        countToInt(-25);
    }

    private static void countToInt(int num)
    {
        int count = 1;

        if (num >= 1)
        {
            while (count < num)
            {
                System.out.println(count);
                count++;
            }
        }
        else if (num < 1)
        {
            while (count >= num)
            {
                System.out.println(count);
                count--;
            }
        }
        else
            System.out.println(count);
    }
}
