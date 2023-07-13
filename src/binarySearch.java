public class binarySearch {
    public static int binarySearch(int array[],int key)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]>key)
            {
                end=mid-1;
            }
            if(array[mid]<key)
            {
                start=mid+1;
            }
            if(array[mid]==key)
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int array[]={3,6,7,11};
        /*{2,4,6,8,10,12,14};*/
        int key=6;
        int index=binarySearch(array,key);
        System.out.println("The Element is found at index : "+index);
    }
}