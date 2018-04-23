public class SevenC
{
    public static void main(String[] args)
    {
        forDownByEight();
        whileDownByEight();
        doWhileDownByEight();
    }

    private static void forDownByEight()
    {
        System.out.println("Method forDownByEight");
        System.out.println();

        for(int i = 100; i >= -100; i-=8)
        {
            System.out.println("i = " + i);
        }
    }

    private static void whileDownByEight()
    {
        System.out.println("Method whileDownByEight");
        System.out.println();

        int i = 100;

        while (i >= -100)
        {
            System.out.println("i = " + i);
            i-=8;
        }
    }

    private static void doWhileDownByEight()
    {
        System.out.println("Method doWhileDownByEight");
        System.out.println();

        int i = 100;

        do
        {
            System.out.println("i = " + i);
            i-=8;
        } while (i >= -100);
    }
}
