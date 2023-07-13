/*
import java.util.Scanner;
public class R06Jan{
    public static void hollowRectangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void halfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halfPyramidWithNUmber(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public static void floydTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int count=1;
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
    public static void ZeroOneTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i+j==0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n)
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
    public static void SolidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
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
    public static void Diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
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
            for(int j=n-i;j>=1;j--)
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
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        hollowRectangle(n);
        System.out.println();
        halfPyramid(n);
        System.out.println();
        halfPyramidWithNUmber(n);
        System.out.println();
        floydTriangle(n);
        System.out.println();
        ZeroOneTriangle(n);
        System.out.println();
        butterfly(n);
        System.out.println();
        SolidRhombus(n);
        System.out.println();
        HollowRhombus(n);
        System.out.println();
        Diamond(n);
        System.out.println();
    }
}*//*


import java.util.*;
public class R06Jan{
    public static void linearSearch(int numbers[], int key)
    {
        for(int i=0;i<=numbers.length;i++)
        {
            if(key==i)
            {
                System.out.print("Key is found!");
            }
        }
    }
    public static int binarySearch(int numbers[],int key)
    {
        int start=0,end=numbers.length-1,mid=(start+end)/2;
        while(start<=end)
        {
            if(key==mid)
            {
                return mid;
            }
            if(key<mid)
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
        //Do Linear Search
        int numbers[]={1,2,3,4,5,6,7,8,10};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        linearSearch(numbers,key);
       System.out.println(binarySearch(numbers,key));
    }
}*/

/*import java.util.Scanner;
public class R06Jan{
    public static int binarySearchone(int numbers[],int key)
    {
        int start=0,end=numbers.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(numbers[mid]==key)
            {
                return mid;
            }
            if(numbers[mid]>key)
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
        int numbers[]={1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        System.out.println("Key found at index"+binarySearchone(numbers,key));
    }
}*/
public class R06Jan {
    public static void main(String args[])
    {

    }
}
