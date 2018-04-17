public class Date
{
    public static void main(String[] args)
    {
        String day   = "Tuesday";
        int date     = 17;
        String month = "April";
        int year     = 2018;

        //System.out.println(day);
        //System.out.println(date);
        // System.out.println(month);
        //System.out.println(year);

        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
