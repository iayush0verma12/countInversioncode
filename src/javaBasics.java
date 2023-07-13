import java.util.Scanner;

public class javaBasics {
   /* public static int CalculateSum(int num,int  num1)
    {
        int sum=num+num1;
        return sum;
    }*/
   /* public static int printHelloWorld()
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 4;
    }*/
    public static float BT(int n,int r)
    {
        int a=1;
        for(int i=1;i<=n;i++)
        {
            a = a * i;
        }
        int b=1;
        for (int i=1;i<=r;i++)
        {
            b=b*i;
        }
        int d=n-r,c=1;
        for(int i=1;i<=d;i++)
        {
            c=c*i;
        }
        float bt=(float)a/(float)(b*c);
        return bt;


    }
    public static void main(String args[])
    {
       /*Scanner sc = new Scanner(System.in);
       int weeknumber = sc.nextInt();
       switch(weeknumber) {
           case 1:
               System.out.println("Monday!");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default: System.out.println("Enter a Valid number");*/
        /*Scanner sc= new Scanner(System.in);
        int yr = sc.nextInt();
        if(yr%4==0 && yr%100!=0|| yr%400==0){
            System.out.println("It is a leap year!");
       }
        else
        {
            System.out.println("It is not a leap year!");
        }*/
        /*Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }*/
       /* Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("Sum of N natural numbers is "+sum);*/
       /* Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }*/
       /* Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ld;
        for(int i=0;n>0;i++)
        {
            ld=n%10;
            System.out.print(ld);
            n=n/10;
        }*/
     /*   Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int ld;
        int num=n;
        int rev=0;
        for(int i=0;num>0;i++)//while(num>0)
        {
            ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        System.out.println("Reverse of the given number is "+rev);*/
       /* Scanner sc= new Scanner(System.in);
        do {
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);


        }while(true);*/
        /*Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1)
        {
            System.out.println("It is not a prime number!");
        }
        if(n==2)
        {
            System.out.println("It is a prime number!");
        }
        else
        {
            boolean isPrime=true;
            for(int i=2;i*i<n;i++)
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
                System.out.println("It is not a prime!");
            }

        }*/
        /*Scanner sc = new Scanner(System.in);
        int even=0,odd=0;
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
                even=even+n;
            }
            else
            {
                odd=odd+n;
            }
        }
        System.out.println("Sum of even numbers is "+even);
        System.out.println("Sum of odd numbers is "+odd);*/
      /*  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);*/
       /* Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
*/
      /*  Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }*/
       /* Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }*/
       /* Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=96, i=1,j=1;
        for( i=1;i<=n;i++)
        {
            for( j=1;j<=i;j++)
            {
                k = k+1;
                char ch=(char)(k);
                System.out.print(ch+" ");
            }
            System.out.println("");
        }*/
        /*printHelloWorld();*/
/*        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=CalculateSum(a,b);
        System.out.println("Sum of two numbers is "+sum);*/
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        float BT= BT(n,r);
        System.out.println(BT);
    }

    }