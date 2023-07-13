public class DNCQ2 {
    public static int returnMajority(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        int count[]=new int[largest+1];
        for(int j=0;j<count.length;j++)
        {
            count[j]=0;
        }
        for(int k=0;k<arr.length;k++)
        {
            count[arr[k]]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>max)
            {
                max=i;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,2,2,3,4,5,2};
        System.out.print(returnMajority(arr));
    }
}