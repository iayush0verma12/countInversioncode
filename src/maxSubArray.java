/*
import java.util.*;
//bruteForceApproach
public class maxSubArray {
    public static void subArray(int numbers[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=0;j<numbers.length;j++)
            {
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {<
                   */
/* System.out.print(numbers[k]+" ");*//*

                    sum+=numbers[k];
                }
                System.out.print(sum+" ");
                if(sum>max)
                {
                    max=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Max Value is "+max);
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7};
        subArray(numbers);
    }
}*/
/*
public class maxSubArray {
    public static void maxSubArray(int numbers[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=0;j<numbers.length;j++)
            {
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum+=numbers[k];
                }
                System.out.println(sum);
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Max Sum Sub ARRAY is"+max);
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,-1,8};
        maxSubArray(numbers);
    }
}
*/
public class maxSubArray {
    public static void maxSubarray(int numbers[])
    {
        int start=0,end,sum=0,max=Integer.MIN_VALUE;
        int n=numbers.length;
        for(int i=0;i<n;i++)
        {
            start=i;
            for(int j=0;j<n;j++)
            {
                end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum += numbers[k];//i wrote i
                }
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println("Max Sub Array Sum is "+max);
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,8};
        maxSubarray(numbers);
    }
}
