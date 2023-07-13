import java.util.Scanner;

public class JavaRev {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b=sc.nextInt();
//        int i=1;
//        while(i<=10)
//        {
//            System.out.println(b+" * "+i+" = "+b*i);
//            i++;
//        }
        //Printing butterfly
//        int n=5;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            for(int k=1;k<=2*(n-i);k++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //New Line of Code Starts here
//
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            for(int k=1;k<=2*(n-i);k++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int num=1011001;
//        int n=num;
//        int sum=0;
//        int i=0;
//        while(n>0)
//        {
//            sum+=(n%10)*Math.pow(2,i);
//            i++;
//            n=n/10;
//        }
//        System.out.println(sum);

        //DEC TO BINARY
        int num=32;
        int n=num;
        int count=0;
        while(n>0)
        {
            n=n/2;
            count++;
        }
        int arr[]=new int[count];
        int i=0;
        while(num>0)
        {
            arr[i]=num%2;
            num=num/2;
            i++;
        }
        for(int j=arr.length-1;j>=0;j--)
        {
           System.out.print(arr[j]+" ");
        }
    }
}