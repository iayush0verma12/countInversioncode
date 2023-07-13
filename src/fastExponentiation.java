import java.util.Scanner;

public class fastExponentiation {
    public static void fastExponentiation(int a, int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int n=sc.nextInt();
        /* int a=5;
        int n=2;*/
        fastExponentiation(a,n);
    }
}