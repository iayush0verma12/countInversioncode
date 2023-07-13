import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class set_ith_bit {
    public static void setIthBit(int n,int i)
    {
        int bitMask=1<<i;
        int set=n|bitMask;
        System.out.println("Value of the bit is "+n);
        System.out.print("Value after bit set is "+set);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        setIthBit(n,i);
    }
}