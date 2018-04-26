import java.util.Collections;

public class StringUtil
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to StringUtil");

        System.out.println("getFirstCharacter for 'Hello' returns " + getFirstCharacter("Hello"));
        System.out.println("getFirstCharacter for 'Goodbye' returns " + getFirstCharacter("Goodbye"));

        System.out.println("getLastCharacter for 'Hello' returns " + getLastCharacter("Hello"));
        System.out.println("getLastCharacter for 'Goodbye' returns " + getLastCharacter("Goodbye"));

        System.out.println("getFirstTwoCharacters for 'Hello' returns " + getFirstTwoCharacters("Hello"));
        System.out.println("getFirstTwoCharacters for 'Goodbye' returns " + getFirstTwoCharacters("Goodbye"));

        System.out.println("getLastTwoCharacters for 'Hello' returns " + getLastTwoCharacters("Hello"));
        System.out.println("getLastTwoCharacters for 'Goodbye' returns " + getLastTwoCharacters("Goodbye"));

        System.out.println("getAllButFirstThreeCharacters for 'Hello' returns " + getAllButFirstThreeCharacters("Hello"));
        System.out.println("getAllButFirstThreeCharacters for 'Goodbye' returns " + getAllButFirstThreeCharacters("Goodbye"));

        printCharacters("Hello");
        printCharacters("Goodbye");

        printPhoneNumber("234-666-8888");
        printPhoneNumber("5015550100");

        System.out.println("findFirstE for 'Hello' is " + findFirstE("Hello"));
        System.out.println("findFirstE for 'Goodbye' is " + findFirstE("Goodbye"));

        System.out.println("isFinn for 'Finn' returns " + isFinn("Finn"));
        System.out.println("isFinn for 'Jake' returns " + isFinn("Jake"));

        System.out.println("Reverse of 'Finn' is " + reverse("Finn"));

        System.out.println("'Hello' is a palindrome: " + isPalindrome("Hello"));
        System.out.println("'racecar' is a palindrome: " + isPalindrome("racecar"));

        System.out.println();

        String[] words1 = {"Listen", "Apple", "Never", "Exclaim", "Red"};
        String[] words2 = {"Sample", "Perfect", "Test", "Test", "Boop"};
        String[] words3 = {"Listen", "Apple", "Never", "Exclaim", "Red", "Angry"};

        System.out.println("Testing allLetters for words1: " + allLetters(words1));
        System.out.println("Testing allLetters for words2: " + allLetters(words2));
        System.out.println("Testing allLetters for words3: " + allLetters(words3));

        System.out.println();

        System.out.println("Testing allLettersNoDupes for words1: " + allLettersNoDupes(words1));
        System.out.println("Testing allLettersNoDupes for words2: " + allLettersNoDupes(words2));
        System.out.println("Testing allLettersNoDupes for words3: " + allLettersNoDupes(words3));

        System.out.println();

        String[] words4 = {"Spock", "Spock", "Kirk", "Kirk"};
        String[] words5 = {"Spock", "Spock", "Kirk", "Kirk", "Spock"};

        System.out.println("Testing sameCount for words4: " + sameCount(words4));
        System.out.println("Testing sameCount for words5: " + sameCount(words5));

        System.out.println();

        String[] words6 = {"Zebra", "Ant", "Car", "Boat", "Alien", "Aardvark", "Giraffe", "Owl", "Earth"};

        System.out.println("words6 initial values: ");
        for (String s : words6)
        {
            System.out.println(s);
        }
        System.out.println("Sorting words6 alphabetically: ");
        words6 = sort(words6);
        for (String s : words6)
        {
            System.out.println(s);
        }

    }

    private static String[] sort(String[] strings)
    {
        for (int i = 0; i < strings.length - 1; i++)
        {
            for (int j = i + 1; j < strings.length; j++)
            {
                if (strings[i].compareTo(strings[j]) > 0)
                {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return strings;
    }

    private static boolean sameCount(String[] words)
    {
        boolean result = true;
        int[] counts = new int[words.length];
        int countIndex = 0;

        for (int i = 0; i < counts.length; i++)
        {
            counts[i] = countOccurences(words, words[i]);
        }

        int tempNum = counts[0];

        for (int i = 0; i < counts.length; i++)
        {
            if (counts[i] != 0 && counts[i] != tempNum)
            {
                result = false;
            }
        }

        return result;
    }

    private static int countOccurences(String[] strings, String value)
    {
        int count = 0;

        for (String s : strings)
        {
            if (s.equals(value))
            {
                count++;
            }
        }

        return count;
    }

    private static boolean allLettersNoDupes(String[] words)
    {
        boolean result = false;

        int countL = 0;
        int countE = 0;
        int countA = 0;
        int countR = 0;
        int countN = 0;


        for (int i = 0; i < words.length; i++)
        {
            if (words[i].charAt(0) == 'L')
            {
                countL++;
            }
            if (words[i].charAt(0) == 'E')
            {
                countE++;
            }
            if (words[i].charAt(0) == 'A')
            {
                countA++;
            }
            if (words[i].charAt(0) == 'R')
            {
                countR++;
            }
            if (words[i].charAt(0) == 'N')
            {
                countN++;
            }
        }

        if (countL == 1 && countE == 1 && countA == 1 &&
                countR == 1 && countN == 1)
        {
            result = true;
        }
        return result;
    }

    private static boolean allLetters(String[] words)
    {
        boolean result = false;

        boolean startsWithL = false;
        boolean startsWithE = false;
        boolean startsWithA = false;
        boolean startsWithR = false;
        boolean startsWithN = false;

        for (int i = 0; i < words.length; i++)
        {
            if (words[i].charAt(0) == 'L')
            {
                startsWithL = true;
            }
            if (words[i].charAt(0) == 'E')
            {
                startsWithE = true;
            }
            if (words[i].charAt(0) == 'A')
            {
                startsWithA = true;
            }
            if (words[i].charAt(0) == 'R')
            {
                startsWithR = true;
            }
            if (words[i].charAt(0) == 'N')
            {
                startsWithN = true;
            }
        }

        if (startsWithL && startsWithE && startsWithA
                && startsWithR && startsWithN)
        {
            result = true;
        }
        return result;
    }

    private static boolean isPalindrome(String s)
    {
        boolean result = false;

        if (s.equals(reverse(s)))
        {
            result = true;
        }

        return result;
    }

    private static String reverse(String s)
    {
        String result = "";

        for (int i = 0; i < s.length(); i++)
        {
            result = result + s.charAt(s.length() - 1 - i);
        }
        return result;
    }

    private static boolean isFinn(String s)
    {
        boolean result = false;

        if (s.equals("Finn"))
        {
            result = true;
        }

        return result;
    }

    private static int findFirstE(String s)
    {
        int result = s.indexOf('e');
        return result;
    }

    private static void printPhoneNumber(String s)
    {
        if (s.length() == 10)
        {
            System.out.println("Area Code: " + s.substring(0, 3) +
                    "\tExchange: " + s.substring(3, 6) +
                    "\tLine Number: " + s.substring(6));
        } else
        {
            System.out.println("Area Code: " + s.substring(0, 3) +
                    "\tExchange: " + s.substring(4, 7) +
                    "\tLine Number: " + s.substring(8));
        }
    }

    private static void printCharacters(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i) + ":" + i);
        }
    }

    private static String getAllButFirstThreeCharacters(String s)
    {
        String result = s.substring(3);

        return result;
    }

    private static String getLastTwoCharacters(String s)
    {
        String result = s.substring(s.length() - 2);

        return result;
    }

    private static String getFirstCharacter(String s)
    {
        String result = s.substring(0, 1);

        return result;
    }

    private static String getLastCharacter(String s)
    {
        String result = s.substring(s.length() - 1);

        return result;
    }

    private static String getFirstTwoCharacters(String s)
    {
        String result = s.substring(0, 2);

        return result;
    }
}
