public class friendsPairnig {
    public static int totalways(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        return totalways(n-1)+(n-1)*totalways(n-2);
    }
    public static void main(String args[])
    {
        int n=3;
        System.out.println(totalways(n));
    }
}