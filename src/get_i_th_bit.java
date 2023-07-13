import java.util.Scanner;

public class get_i_th_bit {
    public static void getIthBit(int n,int i)
    {
        int bitMask= 1<<i;
        if((n&bitMask) == 0)
        {
            System.out.println(i+" bit is "+0);
        }
        else
        {
            System.out.println(i+"th"+" bit is "+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        getIthBit(n,i);
    }
}