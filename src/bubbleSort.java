import java.util.List;

public class bubbleSort {
   /* public static void bubblesort(int array[])
    {
        int swap=0;
        for(int turn=0;turn<array.length-1;turn++)
        {
            if(array[turn+1]>array[turn])
            {
                continue; // This makes the Time Complexity of the funtion as
            };
            for(int j=0;j<array.length-1-turn;j++)
            {
                swap++;
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(swap);
    }*/
    public static void bubblesort(int array[])
    {
        int n=array.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

    }
    public static void printBubbleSortedArray(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5,6};
        bubblesort(array);
        printBubbleSortedArray(array);
    }

}