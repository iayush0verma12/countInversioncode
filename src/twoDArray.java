import java.util.Scanner;
public class twoDArray {
    public static void findKey(int arr[][],int key,int m,int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(key==arr[i][j])
                {
                    System.out.println("Key Found at index"+i+","+j);
                }
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max Value of the Given A1rray is "+max);
    }
    public static void main(String args[])
    {
        int arr[][]= new int[3][3];
        int n = arr.length;
        int m=arr[0].length;
        Scanner sc= new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //Now Printing the A1rray
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(""+arr[i][j]+" ");
            }
            System.out.println();
        }
        findKey(arr,key,m,n);
    }
}