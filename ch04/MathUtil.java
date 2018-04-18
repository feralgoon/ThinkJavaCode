public class MathUtil
{
    private static void printDifference(int num1, int num2)
    {
        int diff = num1 - num2;
        printAbsValue(diff);

    }

    private static void printAbsValue(int num1)
    {
        System.out.println(Math.abs(num1));
    }

    public static void main(String[] args)
    {
        printDifference(1000, 4000000);
    }
}
