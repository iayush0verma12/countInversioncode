import org.jetbrains.annotations.NotNull;

public class ReverseArray {
   /* public static void reverse(int array[])
    {
        int start =0,end=array.length-1;
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }*/
    public static void reverseTwo(int array[])
    {
        int n=array.length;
        for(int i=0;i<=(n-1)/2;i++)
        {
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
    }
    public static void main(String args[])
    {
        int array[]={2,3,6,7,8,9,10};
        System.out.println("Array is : ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
        System.out.println("\n"+"Reverse of Array is : ");
        reverseTwo(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }
}