public class MathUtil
{
    public static void main(String[] args)
    {
        System.out.println(absoluteSum(10, -20));
        System.out.println(absoluteSum(0, -1));
        System.out.println(absoluteSum(12, 12));

        System.out.println();

        System.out.println(absoluteSum(-5, 4, -1));
        System.out.println(absoluteSum(3, -10, -2));
    }

    private static int absoluteSum(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        return a + b;
    }

    private static int absoluteSum(int a, int b, int c)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        return a + b + c;
    }

}
