/*
public class MaxSubArrayPrefixSum {
    public static void MaxSubArrayPrefixSum(int numbers[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                sum= start==0 ?prefix[end]:prefix[end]-prefix[start-1];

                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Max Value of the Given set is "+max);
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,-1,5,6};
        MaxSubArrayPrefixSum(numbers);
    }
}*/
public class MaxSubArrayPrefixSum {
    public static void MaxSUB(int numbers[])
    {
        int prefix[]=new int[numbers.length];
        int sum=0,max=Integer.MIN_VALUE;
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
               sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
               if(sum>max)
               {
                   max=sum;
               }
            }
        }
        System.out.println("MAX of the sub array is "+max);
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7,-1};
        MaxSUB(numbers);
    }
}
