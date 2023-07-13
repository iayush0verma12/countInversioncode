public class modifiedBinarySearch {
    public static int modifiedSearch(int arr[],int target,int si,int ei)
    {
        int mid=si+(ei-si)/2;
        while(si<=ei)
        {
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[si]<=target && target<=arr[mid])
            {
                ei=mid-1;
            }
            else
            {
                si=mid+1;
            }
            if(arr[mid]<=target && target<=arr[ei])
            {
                si=mid+1;
            }
            else
            {
                ei=mid-1;
            }        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={3,5,2,1,7,8,6,19};
        int target=1;
        System.out.println(modifiedSearch(arr,target,0,arr.length-1));
    }
}