import java.util.Scanner;
public class javaBasics2 {
  /*  public static void printPrimeInRange(int n)
    {
        for(int i=2;i<=n-1;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }
    }*/
    /*public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }*/
    public static void printDecimal(int n)
    {
        int num=n;
//        int b=1;
        int pow=0;
        int dec=0;
        while(num>0)
        {
            int ld=num%10;
//            dec=dec+ld*b;
            dec=dec+ld*(int)Math.pow(2,pow);
//            b=2*b;
            pow++;
            num=num/10;
        }
        System.out.print("DECIMAL WQUIVALENT OF "+n+" is "+dec);
    }
    public static void main(String args[])
    {
        /*Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n==1)
        {
            isPrime=false;
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime == false)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("It is a Prime number");
        }*/
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2)
        {
            System.out.println("It is Prime!");
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime==true)
        {
            System.out.println("It is Prime!");
        }
        else
        {
            System.out.println("It is not a Prime!");
        }*/
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printDecimal(n);
    }
}
