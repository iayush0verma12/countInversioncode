public class FibonacciSeries {
    public static int NthFibonacciSeries(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        return NthFibonacciSeries(n-1)+NthFibonacciSeries(n-2);
    }
    public static void main(String args[])
    {
        int n=9;
//        System.out.println(NthFibonacciSeries(n));
        for(int i=1;i<n;i++)
        {
            System.out.print(NthFibonacciSeries(i)+" ");
        }
    }
}