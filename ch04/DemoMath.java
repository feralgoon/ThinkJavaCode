import java.sql.SQLOutput;

public class DemoMath
{
    public static void main(String[] args)
    {
        int num1 = -4;
        int num2 = 3;
        double dub1 = 2.3;
        double dub2 = 1.1;

        System.out.println(num1);
        System.out.println("ABS: " + Math.abs(num1));

        System.out.println();

        System.out.println(num1 + " and " + num2);
        System.out.println("MAX: " + Math.max(num1, num2));

        System.out.println();

        System.out.println(dub1 + " and " + dub2);
        System.out.println("POW: " + Math.pow(dub1, dub2));

        System.out.println();

        System.out.println(Math.PI);

    }
}
