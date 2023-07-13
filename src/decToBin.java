public class decToBin {
    public static void main(String args[])
    {
//        int n=11;
//        int num=n;
//        int bin=0;
//        while(num>0)
//        {
//            int ld=num%2;
//            bin=bin*10+ld;
//            num=num/2;
//        }
//        System.out.println(bin);
//        int n=11;
//        int num=n;
//        int count=0;
//        while(n>0)
//        {
//            count++;
//            n=n/2;
//        }
//        int arr[]=new int[count];
//        for(int i=0;i<arr.length;i++)
//        {
//            int ld=num%2;
//            arr[i]=ld;
//            num=num/2;
//        }
//        for(int j=arr.length-1;j>=0;j--)
//        {
//            System.out.print(arr[j]);
//        }

        int n=11;
        int num=n;
        int count=0;
        while(n>0)
        {
            count++;
            n=n/2;
        }
        int arr[]=new int[count];
        for(int i=0;i<arr.length;i++)
        {
            int ld=num%2;
            arr[i]=ld;
            num=num/2;
        }
        for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
}