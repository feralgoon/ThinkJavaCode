public class Time2Tester
{
    public static void main(String[] args)
    {
        Time2 timeTest1 = new Time2(14, 32);
        Time2 timeTest2 = new Time2(9,45, false);

        System.out.println(timeTest1.getMilitaryTime());
        System.out.println(timeTest2.getMilitaryTime());

        System.out.println(timeTest1.getTime());
        System.out.println(timeTest2.getTime());

        System.out.println(timeTest2.getTime());
        System.out.println(timeTest2.getTime());

    }
}
