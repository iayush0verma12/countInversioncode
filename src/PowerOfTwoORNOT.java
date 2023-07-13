import java.util.Scanner;

public class PowerOfTwoORNOT {
    public static boolean powerOfTwo(int n)
    {
        return (n&(n-1))==0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(powerOfTwo(n))
        {
            System.out.println("Yes Power of Two!");
        }
        else
        {
            System.out.println("No Not a Power of Two!");
        }
    }
}