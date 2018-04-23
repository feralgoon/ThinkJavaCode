import java.sql.SQLOutput;

public class SevenG
{
    public static void main(String[] args)
    {
        multTable(5);
        System.out.println();
        multTable(59);

    }

    private static void multTable(int max)
    {
        int outerCount = 1;
        int innerCount;
        int headerCount = 1;
        int spaceCount = 0;
        String header = "";
        String spacer = "";
        String inLine = "";

        while (headerCount <= max)
        {
            header += ("\t\t|\t\t" + headerCount);
            headerCount++;
        }

        while (spaceCount < header.length())
        {
            if (header.charAt(spaceCount) == '\t')
                spacer += "-----";
            spaceCount++;
        }

        System.out.println(header);
        System.out.println(spacer);

        while (outerCount <= max)
        {
            System.out.print(outerCount + "\t\t|\t\t");
            innerCount = 1;

            while (innerCount <= max)
            {
                if ((innerCount * outerCount) > 999)
                {
                    inLine += ((innerCount * outerCount) + "\t|\t\t");
                }
                else
                {
                    inLine += ((innerCount * outerCount) + "\t\t|\t\t");
                }
                innerCount++;
            }
            System.out.print(inLine);
            inLine = "";
            System.out.println();
            outerCount++;
        }
    }
}
