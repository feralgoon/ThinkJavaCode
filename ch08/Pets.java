import java.util.Scanner;

public class Pets
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numOfPets = 0;

        System.out.println("How many pets do you have? (Enter zero or higher)");

        do
        {
            numOfPets = scan.nextInt();
            scan.nextLine();
        } while (numOfPets < 0);

        String[] petNames = new String[numOfPets];

        System.out.println("What are their names?");

        for (int i = 0; i < petNames.length; i++)
        {
            petNames[i] = scan.nextLine();
        }

        System.out.println("Pet names are: ");
        for (String name : petNames)
        {
            System.out.println(name);
        }
    }
}
