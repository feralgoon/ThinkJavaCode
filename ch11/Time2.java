public class Time2
{
    private int hour;
    private int minute;

    public Time2(int hour, int minute)
    {
        this.hour   = hour;
        this.minute = minute;
    }

    public Time2(int hour, int minute, boolean pm)
    {
        if (pm)
        {
            this.hour   = hour + 12;
            this.minute = minute;
        }
        else
        {
            this.hour   = hour;
            this.minute = minute;
        }
    }

    public String getMilitaryTime()
    {
        return hour + ":" + minute;
    }

    public String getTime()
    {
        if (hour > 12)
        {
            return (hour - 12) + ":" + minute + " PM";
        } else
        {
            return hour + ":" + minute + " AM";
        }
    }
}
