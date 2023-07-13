public class clearIbits {
    public static void clearibits(int n,int i)
    {
        for(int j=0;j<i;j++)
        {
            int bitMask=1<<j;
            n=n&(~bitMask);
        }
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int n=5;
        int i=2;
        clearibits(n,i);
    }
}