/*
public class backTrack1 {
    public static void decreaseArray(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return;
        }
        decreaseArray(arr,i+1);
        arr[arr.length-i-1]=arr[arr.length-i-1]-2;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        decreaseArray(arr,0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}*/

public class backTrack1 {

    public static void changeArr(int arr[],int i,int val)
    {
        if(i==arr.length)
        {
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}