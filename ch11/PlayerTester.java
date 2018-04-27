public class PlayerTester
{
    public static void main(String[] args)
    {
        Player stan = new Player("Stan");

        System.out.println("Score: " + stan.getScore());

        stan.increaseScore();

        System.out.println("Score: " + stan.getScore());

        stan.increaseScore();

        System.out.println("Score: " + stan.getScore());

        stan.increaseScore();

        System.out.println("Score: " + stan.getScore());

        stan.resetScore();

        System.out.println("Score: " + stan.getScore());
    }
}
