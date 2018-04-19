public class SwitchExample
{
    public static void main(String[] args)
    {
        lastNameWinner("Jones");
        lastNameWinner("Smith");
        lastNameWinner("Teague");
        lastNameWinner("Lazenby");
        lastNameWinner("Jason");

        dayOfWeek(4);
        dayOfWeek(2);
        dayOfWeek(-2);
        dayOfWeek(100);
    }

    private static void lastNameWinner(String name)
    {
        switch (name)
        {
            case "Smith": case "Jones":
                System.out.println("Congratulations, grand winner!");
                break;
            case "Lazenby":
                System.out.println("Hey, he owes me dinner.");
                break;
            default:
                System.out.println("Sorry, not a winner.");
                break;
        }
    }

    private static void dayOfWeek(int num)
    {
        switch (num)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value: " + num);
                break;
        }
    }
}
