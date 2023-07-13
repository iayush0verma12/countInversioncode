import java.util.Scanner;

public class javaPattern {
    public static void hollowRectangle(int n)
    {
        int row=1,col=1;
        for(row=1;row<=n-1;row++)
        {
            for(col=1;col<=n;col++)
            {
                if(row==1||col==1||row==4||col==5)
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
    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void halfPyramidWithNumber(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void floydTriangle(int n)
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
    public static void zeroOneTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
    public static void butterflyOne(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=n-2*i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(n-2*i==0)
            {
                break;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=(n-2*i)/2+1;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*i-2;k++)
            {
                System.out.print(" ");
            }
            for(int j=(n-2*i)/2+1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            if(n-2*i==0)
            {
                break;
            }
        }
    }
    public static void butterflyTwo(int n)
    {
        //First half
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i=n;i>=1;i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i==1) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
                if(i==n)
                {
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("*");
                    }
                }
            if(i==1 || i==n)
            {
                continue;
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=n-2;j++)
            {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }


    }
    public static void hollowRhombus(int n)
    {
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void DiamondPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
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
                System.out.print(" *");
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
        halfPyramidWithNumber(n);
        System.out.println();
        floydTriangle(n);
        System.out.println();
        zeroOneTriangle(n);
        System.out.println();
        DiamondPattern(n);
        System.out.println();
        hollowRhombus(n);
        System.out.println();
        solidRhombus(n);
        System.out.println();
        butterflyOne(n);
        System.out.println();
        butterflyOne(n);

    }
}
