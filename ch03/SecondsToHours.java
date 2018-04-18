import java.util.Scanner;

public class SecondsToHours
{
    public static void main(String[] args)
    {
        int secIn, sec, hour, min;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of seconds: ");
        secIn = in.nextInt();
        sec = secIn;

        hour = sec/3600;
        sec -= hour*3600;

        min = sec/60;
        sec -= min*60;

        System.out.printf("%d Seconds = %d hours, %d minutes, and %d seconds. ", secIn, hour, min, sec);
    }
}
