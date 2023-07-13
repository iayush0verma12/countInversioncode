/*
public class powerOfx {
    public static int powerOfTwo(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*powerOfTwo(x,n-1);
    }
    public static void main(String args[])
    {
        int x=2,n=5;
        System.out.println(powerOfTwo(x,n));
    }
}*/

public class powerOfx {
    public static long powerOfTwo(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        long halfpower=powerOfTwo(x,n/2);
        long halfSquare=(halfpower*halfpower)%1000000007;
        if(n%2==1)
        {
            halfSquare=(x*halfSquare)%1000000007;
        }
        return halfSquare;
    }
    public static void main(String args[])
    {
        int x=12,n=21;
        System.out.println(powerOfTwo(x,n));
    }
}