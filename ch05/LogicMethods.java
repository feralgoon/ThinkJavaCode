public class LogicMethods
{
    public static void main(String[] args)
    {
        printIsLarge(79);
        printIsLarge(301);
        printIsLarge(12);
        printIsLarge(-344);
        printIsLarge(734);
        printIsLarge(45);

        System.out.println();

        printIsLargeOrSmall(9);
        printIsLargeOrSmall(64);
        printIsLargeOrSmall(357);
        printIsLargeOrSmall(-999);
        printIsLargeOrSmall(91);
        printIsLargeOrSmall(101);

        System.out.println();

        printLargest(6,9);
        printLargest(-23,-9);
        printLargest(45,17);
        printLargest(55,55);
        printLargest(889, 789);
        printLargest(3,3);
        printLargest(45,34);

        System.out.println();

        printLargestOdd(35,66);
        printLargestOdd(77,77);
        printLargestOdd(88,88);
        printLargestOdd(45,99);
        printLargestOdd(61,59);
        printLargestOdd(87,89);

    }

    private static void printIsLarge(int number)
    {
        if (number > 99)
            System.out.println("The number is large");
    }

    private static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
            System.out.println("The number is large");
        else if (number < 10)
            System.out.println("The number is small");
    }

    private static void printLargest(int num1, int num2)
    {
        if (num1 > num2)
            System.out.println("The largest number is: " + num1);
        else if (num1 < num2)
            System.out.println("The largest number is: " + num2);
        else
            System.out.println("The numbers are equal.");
    }

    private static void printLargestOdd(int number1, int number2)
    {

        //Messed up royally with this code, including using the modulus incorrectly.
        //Use this comment as an example of what not to do when referring back.

        /*if (number1 > number2)
        {
            if (2 % number1 == 1)
                System.out.println("The largest odd number is: " + number1);
        }
        else if (number1 < number2)
        {
            if (2 % number2 == 1)
                System.out.println("The largest odd number is: " + number2);
        }
        else if ((2 % number1 == 0) && (2 % number2 == 0))
            System.out.println("Neither number is odd.");
        else if ((2 % number1 == 1) && (2 % number2 == 1))
        {
            int sum = number1 + number2;
            System.out.println("Two odds make an even: " + sum);
        }*/

        if ((number1 % 2 == 1) && (number2 % 2 == 1))
        {
            if (number1 > number2)
                System.out.println("The largest odd number is: " + number1);
            else if (number1 < number2)
                System.out.println("The largest odd number is: " + number2);
            else
            {
                int sum = number1 + number2;
                System.out.println("Two odds make an even: " + sum);
            }
        }
        else if (number1 % 2 == 1)
            System.out.println("The largest odd number is: " + number1);
        else if (number2 % 2 == 1)
            System.out.println("The largest odd number is: " + number2);
        else
            System.out.println("Neither number is odd.");
    }
}
