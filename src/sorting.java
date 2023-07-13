import java.util.Arrays;
import java.util.Collections;

public class sorting {
    /*public static void selectionSort(int numbers[])
    {
        int n=numbers.length;
        for(int i=0;i<n-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<n;j++)
            {
                if(numbers[minPos]>numbers[j])
                {
                    minPos=j;
                }
            }
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
    }*/
    public static void selectionSort(int numbers[])
    {
        int n=numbers.length;
        for(int i=0;i<n-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<n;j++)
            {
                if(numbers[minPos]>numbers[j])
                {
                    minPos=j;
                }
            }
            int temp=numbers[minPos];
            numbers[minPos]=numbers[i];
            numbers[i]=temp;
        }
    }
    public static void printSorted(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]);
        }
    }
    public static void main(String args[])
    {
        //Selection sort
        int numbers[]={5,4,1,3,2};
        selectionSort(numbers);
        /*insertionSort(numbers);*/
       /* Arrays.sort(numbers, Collections.reverseOrder());*/

        printSorted(numbers);
    }
}