public class clearRangeOfBits {
    public static void clearRange(int n,int i,int i1)
    {
        for(int j=i;j<=i1;j++)
        {
            int bitMask=1<<j;
            n=n&(~bitMask);
        }
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int n=15;
        int i=1;
        int i1=2;
        clearRange(n,i,i1);
    }
}