public class recursiontwo {
    /*public static void printNumbersNames(int arr[],int i)
    {
        if(i==arr.length|| arr[arr.length-1]==0)
        {
            return;
        }
            if(arr[i]==0)
            {
                System.out.print("Zero"+" ");
            }
            else if(arr[i]==1)
            {
                System.out.print("One"+" ");
            }
            else if(arr[i]==2)
            {
                System.out.print("Two"+" ");
            }
            else if(arr[i]==3)
            {
                System.out.print("Three"+" ");
            }
            else if(arr[i]==4)
            {
                System.out.println("Four"+" ");
            }
            else if(arr[i]==5)
            {
                System.out.print("Five"+" ");
            }
            else if(arr[i]==6)
            {
                System.out.print("Six"+" ");
            }
            else if(arr[i]==7)
            {
                System.out.print("Seven"+" ");
            }
            else if(arr[i]==8)
            {
                System.out.print("Eight"+" ");
            }
            else if(arr[i]==9)
            {
                System.out.print("Nine"+" ");
            }
        printNumbersNames(arr,i+1);
    }*/

    static String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void printNumbersNames(int number)
    {
        if(number==0)
        {
            return;
        }
        int ld=number%10;
        printNumbersNames(number/10);
        System.out.print(digits[ld]+" ");
    }
    public static void main(String args[])
    {
        //Using Arrays
//        int arr[]={2,0,1,9};
        int number=2018;
        printNumbersNames(number);
    }
}