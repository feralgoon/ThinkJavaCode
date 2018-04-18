import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        double temp,convertedTemp;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature to convert in Celcius: ");
        temp = in.nextDouble();

        convertedTemp = (9.0/5.0) * temp + 32;

        System.out.printf("%.1f C = %.1f F", temp, convertedTemp);
    }
}
