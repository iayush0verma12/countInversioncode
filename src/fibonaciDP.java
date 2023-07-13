public class fibonaciDP {
//    public static int NthFibonacci(int n,int f[])
//    {
//        if(n==0||n==1)
//        {
//            return n;
//        }
//        if(f[n]!=0)
//        {
//            return f[n];
//        }
//        f[n]=NthFibonacci(n-1,f)+NthFibonacci(n-2,f);
//        return f[n];
//    }
    public static int NthFibonacciTB(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
//        int f[]=new int[n+1];
        for(int i=0;i<n;i++) {

        }
        System.out.print(NthFibonacciTB(8)+" ");

    }
}
