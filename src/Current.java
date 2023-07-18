public class Current {
    public static void printhollowrec()
    {
        int n=3,m=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0|j==0|i==n-1|j==m-1)
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
    //print half pyramid
    public static void printhalfPyra()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printfloyd()
    {
        int n=5;
        int cnt=1;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    //0,0,
    //1,0,0,1
    //2,0,2,1,2,2
    public static void printZeroNe()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }

            }
            System.out.println();
        }
    }
    //butterfly
    //left print * space and right print
    //j<=i & for space k<=2*(i-1)

    public static void printbutter()
    {
        int n=5;
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

    public static void solidRhombus()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
            {
                if(i==0|j==0|j==n-1|i==n-1)
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

    public static void diamond()
    {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i);k++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        n=6;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //Pattern printing ka
    public static void main(String[] args) {
        //print a hollow rectangle
        //half pyramid
        //halfpyramid with number
        //floyd triangle
        //zero one triangle
        //butterflyone
        //solid rhombus
        //hollow rhombus
        //diamond pattern
        printhollowrec();
        System.out.println();
        printhalfPyra();
        System.out.println();
        printfloyd();
        System.out.println();
        printZeroNe();
        System.out.println();
        printbutter();
        System.out.println();
        solidRhombus();
        System.out.println();
        hollowRhombus();
        System.out.println();
        diamond();
        System.out.println();
    }
}
