public class Multadd
{
    public static void main(String[] args)
    {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(3.0, 2.0, 4.0));
    }

    private static double multadd(double a, double b, double c)
    {
        return (a * b + c);
    }
}
