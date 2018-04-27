public class PlanetTester
{
    public static void main(String[] args)
    {
        Planet mercury      = new Planet("Mercury");
        Planet venus        = new Planet("Venus");
        Planet earth        = new Planet("Earth");
        Planet mars         = new Planet("Mars");
        Planet jupiter      = new Planet("Jupiter");
        Planet saturn       = new Planet("Saturn");
        Planet uranus       = new Planet("Uranus");
        Planet neptune      = new Planet("Neptune");
        Planet dwarfPluto   = new Planet("Pluto");

        Planet[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, dwarfPluto};

        for(int i = 0; i < planets.length; i++)
        {
            System.out.println(planets[i].getName());
        }
    }
}
