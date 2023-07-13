import java.util.Scanner;

public class updateIthBit{
    public static int updateIthBit(int n,int i,int newBit)
    {
        /*if(newBit==0)
        {
            return clearIthBit;
        }
        else {
            return set_ith_bit;
        }*/
        //Clear ith Bit
        int bitMask=1<<i;
        int clearBit=n&(~bitMask);
        n=clearBit;
        bitMask=1<<newBit;
        return n|bitMask;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int newBit=sc.nextInt();//0 or 1
        int m=updateIthBit(n,i,newBit);
        System.out.println(m);


    }
}