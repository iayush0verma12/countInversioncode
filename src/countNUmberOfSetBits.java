public class countNUmberOfSetBits {
    public static void countSetBits(int n)
    {
        int bitMask=1;
        int count=0;
        int num=n;
        for(int i=0;i<=(Math.log10(n)/Math.log10(2))+1;i++)
        {

            if((num&1)!=0)
            {
                count++;
            }
            num=num>>1;
        }
       /* while(n>0)
        {
            if(((n&1)!=0))
            {
                count++;
            }
            n=n>>1;
        }*/
        System.out.println(count);
    }
    public static void main(String args[])
    {
        int n=10;
        countSetBits(n);
    }
}