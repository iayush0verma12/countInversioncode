import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int mxl=0,d=0,c1=0;

        Scanner sc=new Scanner(System.in);
        //enter the number of rounds
        int n=sc.nextInt();
        int a[][]=new int[1][2];
        while(n!=0){
            for(int j=0;j<2;j++){
                a[0][j]=sc.nextInt();
            }

            if(a[0][0]>a[0][1]){
                d=a[0][0]-a[0][1];
                if(d>mxl){
                    mxl=d;
                    c1=1;
                }
            }else{
                d=a[0][1]-a[0][0];
                if(d>mxl){
                    mxl=d;
                    c1=2;
                }
            }
            n--;
        }
        System.out.println(c1+" "+mxl);
    }
}