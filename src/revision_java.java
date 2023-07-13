import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class revision_java {
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void printHollowRectangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    System.out.print("*");
                }
                else
                {System.out.print(" ");}
            }
            System.out.println();
        }
    }
    public static void printInvertedTriangle(int n)
    {
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
             System.out.print(count+" ");
             count++;
            }
            System.out.println();
        }
    }

    public static void print01Triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void printButterFly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printDiamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static int binarySearch(int arr[],int key)
    {
        int start=arr[0];
        int end=arr[arr.length-1];
        int mid=0;
        while(start<end)
        {
            mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int arr[])
    {
        int temp=0;
        for(int i=0;i<(arr.length-1)/2;i++)
        {
             temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void pairsOfArray(int arr[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;

            for(int j=i+1;j<arr.length;j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    //System.out.print(arr[k]);
                    //System.out.print("( " + arr[i] + "," + arr[j] + " )");
                    sum += arr[k];
                }
                max = Math.max(sum, max);
                sum=0;
//                System.out.println();
            }
        }
        System.out.println(max);
    }
    public static void prefixSum(int arr[])
    {
        //prefix
        //array
        //formula
        //special case
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int currSum=0,max=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i+1;j<arr.length;j++)
            {
                int end=j;
                currSum=(start==0)?(prefix[end]):(prefix[end]-prefix[start-1]);
            }
            if(max<currSum)
            {
                max=currSum;
            }
        }
        System.out.println(max);
    }
    public static void kadenceAlgo(int arr[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
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
    public static void TrappedWater(int arr[])
    {
        //left boundary
        int n=arr.length;
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        int trappedWater=0;
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //RightBoundary
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--)
        {
            rightMax[j]=Math.max(arr[j],rightMax[j+1]);
        }
        for(int i=0;i<n;i++)
        {
            int WaterTrapped=Math.min(leftmax[i],rightMax[i]);
            trappedWater+=WaterTrapped-arr[i];
        }
        System.out.println(trappedWater);
    }
    public static void maxProfit(int arr[])
    {
        int buyPrice=Integer.MAX_VALUE,MaxProfit=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sellPrice=Math.max(arr[i],sellPrice);
//        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>buyPrice)
            {
                int profit=arr[i]-buyPrice;
                MaxProfit=Math.max(MaxProfit,profit);
            }
            else
            {
                buyPrice=arr[i];
            }
        }
        System.out.println(MaxProfit);
    }
    public static void TrappedQuestion(int arr[])
    {
        int n=arr.length;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        int trapped=0;
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        for(int i=0;i<n;i++)
        {
            int WaterTrapped=Math.min(leftMax[i],rightMax[i]);
            trapped+=WaterTrapped-arr[i];
        }
        System.out.println(trapped);
    }
    public static void main(String args[])
    {
        int a=9;
//        System.out.println(a);
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
        int arr[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
//        if(isPrime(n))
//        {
//            System.out.println("It is a Prime Number!");
//        }
//        else
//        {
//            System.out.println("It is not a Prime NUmber!");
//        }
// Printing a Hollow Rectangle
//        printHollowRectangle(n);
//        printInvertedTriangle(n);
//        print01Triangle(n);
//        printButterFly(n);
//        printHollowRhombus(n);
//        printDiamond(n);
//        int key=4;
//          System.out.println(binarySearch(arr,key));
//        reverseArray(arr);
//        Collections.reverse(Arrays.asList(arr));

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]);
//        }
//        pairsOfArray(arr);
//        prefixSum(arr);
//        kadenceAlgo(arr);
//        TrappedWater(arr);
//        maxProfit(arr);
        TrappedQuestion(arr);
    }
}
