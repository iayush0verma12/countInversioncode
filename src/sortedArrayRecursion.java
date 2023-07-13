public class sortedArrayRecursion {
    public static boolean isSorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,98,5,6};
        int i=0;
        if(isSorted(arr,i))
        {
            System.out.println("Sorted Array");
        }
        else
        {
            System.out.println("Not a Sorted Array");
        }
    }
}