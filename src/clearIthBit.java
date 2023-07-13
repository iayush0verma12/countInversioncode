import java.util.Scanner;

public class clearIthBit {
    public static void ClearIthBit(int n,int i)
    {
        int bitMask=1<<i;
        int clearBit=n&(~bitMask);
        System.out.println("Original number is"+n);
        System.out.println("Number After Clearing "+i+"th bit is "+clearBit);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        ClearIthBit(n,i);
    }
}