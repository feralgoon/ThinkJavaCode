public class SevenB
{
    public static void main(String[] args)
    {
        forUp();
        whileUp();
        doWhileUp();
    }

    private static void forUp()
    {
        System.out.println("Method forUp");
        System.out.println();

        for(int i = 10; i <= 100; i+=10)
        {
            System.out.println("i = " + i);
        }
    }

    private static void whileUp()
    {
        System.out.println("Method whileUp");
        System.out.println();

        int i = 10;

        while (i <= 100)
        {
            System.out.println("i = " + i);
            i+=10;
        }
    }

    private static void doWhileUp()
    {
        System.out.println("Method doWhileUp");
        System.out.println();

        int i = 10;

        do
        {
            System.out.println("i = " + i);
            i+=10;
        } while (i <= 100);
    }
}
