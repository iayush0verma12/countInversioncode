/*
import java.util.Scanner;

public class Practice25jan {
    public static int linearSearch(int arr[],int key)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("\n Element found at "+(linearSearch(arr,key)+1)+" Position");
    }
}*/

//BinarySearch
/*
public class Practice25jan {
    public static int binarySearch(int arr[],int key)
    {
        int start=0,end=arr.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int key=3;
        System.out.println("Element found at Index "+binarySearch(arr,key));
    }
}*/

//ReverseAnArray
/*
public class Practice25jan {
    public static void reverse(int arr[])
    {
        int temp=0;
        for(int i=0;i<=(arr.length-1)/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        reverse(arr);
    }
}*/

//pair Pair
/*
public class Practice25jan {
    public static void printPairs(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
//            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+" , "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        printPairs(arr);
    }
}*/
//subarray
//continous part of an array
/*
public class Practice25jan {
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int start=0;
        int end=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            start=i;
            for(int j=i;j<n;j++)
            {
                end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/
//max sum subArray
/*public class Practice25jan {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int start=0;
            for(int j=i;j<n;j++)
            {
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum+=arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
            }

        }
        System.out.println("Max Sum is "+max);
    }
}*/

//MaxSubArrayPrefixSum
/*public class Practice25jan {
    public static void main(String args[])
    {
        int arr[]={1,2,4,3,5};
        int sum=0,max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
}*/
//Kadane Algorithm
/*public class Practice25jan {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cs+=arr[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
}*/

//RainTrapping Problem
/*public class Practice25jan {
    public static void main(String args[])
    {
        int arr[]={6,4,2,0,1,3,4,7,8};
        int leftMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        int rightMax[]=new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--)
        {
            rightMax[j]=Math.max(rightMax[j+1],arr[j]);
        }
        int trappedWater=0;
        for(int i=0;i<arr.length;i++)
        {
            int WaterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=WaterLevel-arr[i];
        }
        System.out.println(trappedWater);
    }
}*/

//buy and sell Stocks
/*public class Practice25jan {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int buyStock=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(buyStock<arr[i])
            {
                int profit=arr[i]-buyStock;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
            {
                buyStock=arr[i];
            }
        }
        System.out.print("Max Profit is "+maxProfit);
    }
}*/
//Bubble Sort
public class Practice25jan {
    public static void printsortedarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,8};
        int n=arr.length;
        //bubblesort
       /* for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }*/
        //SelectionSort
        /*for(int i=0;i<n;i++)
        {
            int misPos=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[misPos]>arr[j])
                {
                    misPos=j;
                }
            }
            int temp=arr[misPos];
            arr[misPos]=arr[i];
            arr[i]=temp;
        }
        printsortedarray(arr);*/
        //InsertionSort
        /*for(int i=0;i<arr.length;i++)
        {
            int curr=i;
            int prev=i-1;
            while(prev>=0&&arr[prev]>arr[curr])
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];
        }
        printsortedarray(arr);*/

        //countingsort

        /*int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        printsortedarray(arr);*/
    }
}
