import java.util.Arrays;

public class Sortprac {
    public static void bubble(int arr[])
    {
        //bubbleSort
        //2loops
        //turns - n-2
        // n-turns-1 2nd loop
        // adjacent element swap
        int n=arr.length;
        for(int turns=0;turns<n-1;turns++)
        {
            for(int j=0;j<n-turns-1;j++)
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

    public static void select(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
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
    public static void insert(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int prev=i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void bubbleD(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectD(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]<arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertD(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void countingD(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        Arrays.fill(count,0);
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[arr.length-j-1]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
//        bubble(arr);
//         bubbleD(arr);
//          select(arr);
//        selectD(arr);
//        insert(arr);
//        insertD(arr);
        countingD(arr);
        for(int num : arr)
        {
            System.out.print(num+ " ");
        }
    }
}
