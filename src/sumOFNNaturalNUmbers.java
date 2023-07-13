public class sumOFNNaturalNUmbers {
    public static int sumofNUmber(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumofNUmber(n-1);
    }
    public static void main(String args[])
    {
     int n=10;
     System.out.println(sumofNUmber(n));
    }
}