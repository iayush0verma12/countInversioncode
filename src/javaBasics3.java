import java.util.Scanner;

public class javaBasics3 {
   /* public static void printBinary(int n)
    {
        *//*int num=n;
        int b=1,sum=0;
        while(num>0)
        {
            int ld=num%2;
            sum =sum+b*ld;
            b=b*10;
            num=num/2;
        }
        System.out.print("Binary Equivalent of Decimal " + " is "+sum);*//*
    }*/
    public static void printSumOfDigit(int n)
    {
        int sum=0,ld=0;
        while(n>0)
        {
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println("Sum of Digits is "+sum);
    }
    public static void main(String args[])
    {
        //Java program to convert decimal to binary
       /* Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printBinary(n);*/
        Scanner sc = new Scanner(System.in);
        if(1+1+1+1+1==5)
        {
            System.out.println("True");
        }
        int n = sc.nextInt();
        printSumOfDigit(n);
    }
}
