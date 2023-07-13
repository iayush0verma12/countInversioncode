/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class minimalInversion
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);// your code goes here
        int T=sc.nextInt();
        int N=sc.nextInt();
        int A[]=new int[N];
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(A[i]);
        }
        //find l and r
        int invA=0;
        int invB=0;
        int L1=0,R1=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(A[i]>A[j] && j>i)
                {
                    invA++;
                }
            }
        }
        System.out.println("\n"+invA);
        //applying operation

        /*for(int i=0;i<N;i++)
        {
            int L=i;
            for(int j=i+1;j<N;j++)
            {
                int R=j;
                for(int k=L;k<=R;k++)
                {
                    sum+=A[k];
                }
                min=Math.min(sum,min);
                if(sum<min)
                {
                    L1=L;
                    R1=R;
                }
            }
        }*/

        for(int i=1;i<N;i++)
        {
            int L=i;
            for(int j=i+1;j<N;j++)
            {
                int R=j;

            }
        }


        int L2=L1+1;
        int R2=R1+1;
        for(int i=L2;i<=R2;i++)
        {
            A[i]=A[i]+1;
        }

        System.out.println();

        for(int i=0;i<N;i++)
        {
            System.out.print(A[i]);
        }

        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(A[i]>A[j] && j>i)
                {
                    invB++;
                }
            }
        }

        System.out.println("\n"+invA);

        int maxDec=invA-invB;
        System.out.println("\n"+maxDec);
    }
    // inv(a) is initial inversion counted
    //inv(b) after one UnsupportedOperationExceptio
    //print inv(a)-inv(b);
}
