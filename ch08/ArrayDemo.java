public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] nums1 = {1,5,9};
        int[] nums2 = {5,7,13};
        int[] nums3 = {5,8,21,19,2};
        int[] nums4 = {78,23,9,34};

        int[] nums5 = new int[10];

        nums5[0] = 4;
        nums5[3] = 2;
        nums5[9] = 4;

        double[] dubs1 = {34.2,18.0,12.5,13.1};
        double[] dubs2 = {10.0,15.0,20.0};

        String[] words = new String[10];

        words[0] = "Hi";
        words[3] = "Hello";
        words[9] = "Bye";

        System.out.println("Printing array");
        printArray(nums1);

        int numsOneSum = arrayTotal(nums1);
        int numsTwoSum = arrayTotal(nums2);

        System.out.println("Finding sums");
        System.out.println(numsOneSum);
        System.out.println(numsTwoSum);

        int maxArrayOne = arrayMax(nums1);
        int maxArrayTwo = arrayMax(nums2);
        int maxArrayThr = arrayMax(nums3);
        int maxArrayFou = arrayMax(nums4);

        System.out.println("Finding max values");
        System.out.println(maxArrayOne);
        System.out.println(maxArrayTwo);
        System.out.println(maxArrayThr);
        System.out.println(maxArrayFou);

        int maxIndexOne = arrayMaxIndex(nums1);
        int maxIndexTwo = arrayMaxIndex(nums2);
        int maxIndexThr = arrayMaxIndex(nums3);
        int maxIndexFou = arrayMaxIndex(nums4);

        System.out.println("Finding index of max values");
        System.out.println(maxIndexOne);
        System.out.println(maxIndexTwo);
        System.out.println(maxIndexTwo);
        System.out.println(maxIndexFou);

        double dubOneAvg = arrayAverage(dubs1);
        double dubTwoAvg = arrayAverage(dubs2);

        System.out.println("Gettig averages");
        System.out.println(dubOneAvg);
        System.out.println(dubTwoAvg);

        System.out.println("Printing array");
        printArray(nums5);

        System.out.println("Printing String Array");
        printArray(words);

    }

    private static void printArray(int[] nums)
    {
        for (int i : nums)
        {
            System.out.println(i);
        }
    }

    private static int arrayTotal(int[] nums)
    {
        int sum = 0;

        for (int i : nums)
        {
            sum += i;
        }

        return sum;
    }

    private static int arrayMax(int[] nums)
    {
        int max = 0;

        for (int i : nums)
        {
            max = Math.max(max, i);
        }

        return max;
    }

    private static int arrayMaxIndex(int[] nums)
    {
        int index   = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                index = i;
            }
        }

        return index;
    }

    private static double arrayAverage(double[] nums)
    {
        double sum = 0.0;
        double avg;

        int count = 0;

        for(double i : nums)
        {
            sum += i;
            count++;
        }

        avg = sum/count;

        return avg;
    }

    private static void printArray(String[] words)
    {
        for (String word : words)
        {
            System.out.println(word);
        }
    }
}
