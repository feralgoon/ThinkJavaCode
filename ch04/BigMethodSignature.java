public class BigMethodSignature
{
    public static void main(String[] args)
    {
        printSum(4, 1, 35, 81, -3, 90,
                444, -65, 901, 11);
    }

    private static void printSum(int num1, int num2, int num3, int num4, int num5, int num6,
                                 int num7, int num8, int num9, int num0)
    {
        int sum = num1 + num2 + num3 + num4 + num5 + num6
                + num7 + num8 + num9 + num0;

        System.out.println("The sum is " + sum);
    }
}
