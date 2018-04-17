public class Time
{
    public static void main(String[] args)
    {
        int hour = 14;
        int min  = 58;
        int sec  = 35;

        int secSinceMidnight = (hour*60*60) + (min*60) + (sec);
        System.out.println("There have been " + secSinceMidnight + " seconds since midnight.");

        int secRemaining = ((24-hour) * 60 * 60) + ((60-min) * 60) + (60-sec);
        System.out.println("There are " + secRemaining + " seconds remaining today.");

        float percRemain = ((float)secRemaining * 100) / (60*60*24);
        System.out.println("There is " + percRemain + " percent of the day remaining.");

        hour = 15;
        min  = 11;
        sec  = 17;

        int elapsedTime = (hour * 60 * 60) + (min * 60) + sec;
        elapsedTime -= secSinceMidnight;

        System.out.println("It took " + elapsedTime + " seconds to write this program.");
    }
}
