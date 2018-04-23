public class SevenA
{
    public static void main(String[] args)
    {
        forUp();
        whileUp();
        doWhileUp();
        forDown();
        whileDown();
        doWhileDown();
    }

    private static void forUp()
    {
        System.out.println("Method forUp");
        System.out.println();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println("i = " + i);
        }
    }

    private static void whileUp()
    {
        System.out.println("Method whileUp");
        System.out.println();

        int i = 1;

        while (i <= 10)
        {
            System.out.println("i = " + i);
            i++;
        }
    }

    private static void doWhileUp()
    {
        System.out.println("Method doWhileUp");
        System.out.println();

        int i = 1;

        do
        {
            System.out.println("i = " + i);
            i++;
        } while (i <= 10);
    }

    private static void forDown()
    {
        System.out.println("Method forDown");
        System.out.println();

        for(int i = 10; i > 0; i--)
        {
            System.out.println("i = " + i);
        }
    }

    private static void whileDown()
    {
        System.out.println("Method whileDown");
        System.out.println();

        int i = 10;

        while (i > 0)
        {
            System.out.println("i = " + i);
            i--;
        }
    }

    private static void doWhileDown()
    {
        System.out.println("Method doWhileDown");
        System.out.println();

        int i = 10;

        do
        {
            System.out.println("i = " + i);
            i--;
        } while (i > 0);
    }

}
