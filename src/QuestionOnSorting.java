public class QuestionOnSorting{
    public static void bubblesort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printSortedArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        //bubblesort
        //selectionsort
        //insertionsort
        //countingsort
        int arr[]={5,2,3,4,1};
        /*bubblesort(arr);*/
       /* selectionsort(arr);*/
        insertionsort(arr);
        printSortedArray(arr);
    }
}