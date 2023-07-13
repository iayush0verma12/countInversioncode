public class recursion2{
    public static void printNumberInIncresingOrder(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printNumberInIncresingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[])
    {
        int n=10;
        printNumberInIncresingOrder(n);
    }
}