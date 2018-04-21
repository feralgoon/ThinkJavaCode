public class MethodChecks
{
    public static void main(String[] args)
    {
        System.out.println(isDivisible(3,5));
        System.out.println(isDivisible(10,5));

        System.out.println();

        System.out.println(isTriangle(12, 1, 3));
        System.out.println(isTriangle(4, 5, 9));
        System.out.println(isTriangle(61, 455, 288));
        System.out.println(isTriangle(15, 16, 12));
        System.out.println(isTriangle(61, 455, 28));
        System.out.println(isTriangle(6, 45, 28));
        System.out.println(isTriangle(10, 8,19));
    }

    private static boolean isDivisible(int n, int m)
    {
        if (n % m == 0)
            return true;
        else
            return false;
    }

    private static boolean isTriangle(int a, int b, int c)
    {
        boolean result = true;

        if ( a > (b + c))
            result = false;
        else if (b > (a + c))
            result = false;
        else if (c > (b + c))
            result = false;

        return result;
    }
}
