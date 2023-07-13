import java.util.Scanner;

public class checkEvenOdd{
    public static boolean checkEVENODD(int n)
    {
        if((n&1)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(checkEVENODD(n))
        {
            System.out.println("It is a even!");
        }
        else
        {
            System.out.println("It is odd!");
        }
    }
}