public class DateTester
{
    public static void main(String[] args)
    {
        Date currentDate = new Date(5, 04, 2018);

        System.out.println("Day:\t" + currentDate.getDay());
        System.out.println("Month:\t" + currentDate.getMonth());
        System.out.println("Year:\t" + currentDate.getYear());

        System.out.println(currentDate.getFormattedDate());
    }
}
