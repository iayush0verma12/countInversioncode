public class Recursion1 {
    public static void printNumbers(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String args[])
    {
        int n=10;
        printNumbers(n);
    }
}