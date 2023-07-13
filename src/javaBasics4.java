import java.util.Scanner;

public class javaBasics4 {
   /* public static void printAverage(int a,int b,int c)
    {
        float average=(a+b+c)/3;
        System.out.println(average);
    }*/
   /* public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        { return false;}
    }*/
    /*public static boolean isPalindrome(int n)
    {
        int num=n;
        int rev=0;
        int ld=0;
        while(num>0)
        {
            ld = num % 10;
            rev=rev*10+ld;
            num=num/10;
        }
        if(rev==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printAverage(a,b,c);*/
        /*Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isEven(n))
        {
            System.out.println("Even Number!");
        }
        else
        {
            System.out.println("Not a Even Number!");
        }*/
       /* Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindrome(n))
        {
         System.out.println("IT IS PALINDROME!");
        }
        else
        {
            System.out.println("IT IS NOT A PALINDROME!");
        }*/
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        float e= (int) Math.sqrt(a);
        int f= (int) Math.pow(a,b);
        int i=Math.abs(-a);
        System.out.println("Max of "+a+" and "+b+" is "+c);
        System.out.println("Min of "+a+" and "+b+" is "+d);
        System.out.println("Square root of "+a+" is "+e);
        System.out.println(a+" raised to "+b+" is "+f);
        System.out.println("Absolute value of "+a+" is "+i);

    }
}
