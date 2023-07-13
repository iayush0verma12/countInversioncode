public class subArray {
    public static void subArray(int numbers[])
    {
        int start=0,end= numbers.length-1;
        for(int i=0;i<numbers.length;i++)
        {
            start=i;
            for(int j=0;j<numbers.length;j++)
            {
                end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7};
        subArray(numbers);
    }
}