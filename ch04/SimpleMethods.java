import java.sql.SQLOutput;

public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount(5);

        printSum(4,6);
        printSum(7,2);

        printBoolean(true);
        printBoolean(false);
    }

    private static void printCount(int count)
    {
        System.out.println("The count it: " + count);
    }

    private static void printSum(int val1, int val2)
    {
        int sum = val1 + val2;

        System.out.println(val1 + " + " + val2 + " = " + sum);
    }

    private static void printBoolean(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }
}
