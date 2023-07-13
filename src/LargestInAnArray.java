import java.util.*;
public class LargestInAnArray {
    public static int getLargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
            if(Smallest>numbers[i])
            {
                Smallest=numbers[i];
            }
        }
        System.out.println("Smallest number of the given array is-"+Smallest);
        System.out.println("Largest number of the given array is-"+largest);
        return largest;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Fir se largest value print kar raha hu!"+getLargest(numbers));
    }
}
