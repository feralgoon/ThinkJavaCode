import java.util.Random;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        int birthYear           = 1993;
        boolean isUnionMember   = false;
        String firstName        = "Joseph";
        String midName          = "Daniel";
        String lastName         = "Teague";
        int employeeNumber;

        Scanner scanner = new Scanner(System.in);

        printHeader();

        System.out.println("Please enter your 5 digit employee number: ");
        employeeNumber = scanner.nextInt();

        printFullName(firstName, midName, lastName);
        printUnionStatus(isUnionMember);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGenerateSecretPassword(employeeNumber);
    }

    private static void printHeader()
    {
        System.out.println("Welcome to WallabyTech Employee Application");
        System.out.println("===========================================");
    }

    private static void printFullName(String first, String mid, String last)
    {
        System.out.println(last + ", " + first + " " + mid);
    }

    private static void printUnionStatus(boolean status)
    {
        System.out.println("Your union status is: " + status);
    }

    private static void printAge(int birthYear)
    {
        int age = 2018 - birthYear;

        System.out.println("Your age is: " + age);
    }

    private static void printEvenOrOdd(int number)
    {
        number %= 2;
        System.out.println("Employee number is even/odd (1=odd, 0=even): " + number);
    }

    private static void printGenerateSecretPassword(int num)
    {
        Random rNum = new Random();
        int randNum = rNum.nextInt(10) + 1;

        int password = (num + randNum) * 5;

        System.out.println("Employee's random secret pw is: " + password);

    }
}
