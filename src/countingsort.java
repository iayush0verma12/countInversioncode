public class countingsort {
    public static void countingsort(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
            {
                largest=Math.max(largest,numbers[i]);
            }
        int count[]= new int[largest+1];

        for(int i=0;i<numbers.length;i++)
        {
            count[numbers[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                numbers[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void printSortedArray(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(" "+numbers[i]);
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,345,6,78,9};
        countingsort(numbers);
        printSortedArray(numbers);
    }

    // DO NOT APPLY IT WITH NUMBERS WITH SAME INDEX
}