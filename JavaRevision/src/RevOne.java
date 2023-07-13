import java.util.Arrays;
import java.util.Scanner;
//bubbleSort
public class RevOne {
//    public static void bubbleSort(int arr[])
//    {
//        int n=arr.length;
//
//        for(int i=0;i<n-1;i++) {
//            boolean swapped=false;
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(swapped==false)
//            {
//                break;
//            }
//        }
//    }
//    public static void bubbleSort(int arr[])
//    {
//        int n= arr.length;
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=0;j<n-1-i;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void bubbleSort(int arr[])
//    {
//        int n=arr.length;
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=0;j<n-1-i;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void bubbleSort(int arr[])
//    {
//        int n=arr.length;
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=0;j<n-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void bubbleSort(int arr[])
//    {
//        int n=arr.length;
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=0;j<n-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void insertionSort(int arr[])
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            int minPos=i;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[minPos]>arr[j])
//                {
//                    minPos=j;
//                }
//            }
//        }
//    }
//    public static void insertionSort(int arr[])
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            int minPos=i;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[minPos]>arr[j])
//                {
//                    minPos=j;
//                }
//            }
//        }
//    }
//    public static void bubbleSort(int arr[])
//    {
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-1-i;j++)
//            {
//                if(arr[j]>arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }

    public static void insertionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void countingSort(int arr[])
    {

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void printSpiral(int matrix[][])
    {
        int count=0;
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startCol==endCol)
                {
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }
//    public static void searchSorted(int matrix[][],int key)
//    {
//        int row=0,col=matrix[0].length-1;
//        while(row<matrix.length && col>=0)
//        {
//            if(matrix[row][col]==key)
//            {
//                System.out.println("Key Found at ( "+row+" , "+col+" )");
//                break;
//            }
//            else if (key<matrix[row][col])
//            {
//                col--;
//            }
//            else
//            {
//                row++;
//            }
//        }
//    }
    public static void searchSorted(int matrix[][],int key)
    {
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col >=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Key Found at ( "+row+" , "+col+" ) ");
                break;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
    }
    public static int apple(int n)
    {
        return (--n);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]= new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
        int matrix[][]={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key=33;
//        bubbleSort(arr);
//        insertionSort(arr);
//        countingSort(arr);
//        printSpiral(matrix);
//        searchSorted(matrix,key);
//        System.out.println("Sorted Array is -");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

//        String a="my name is Khan";
//        StringBuilder sb= new StringBuilder("");
//        char ch = Character.toUpperCase(a.charAt(0));
//        sb.append(ch);
//        for(int i=1;i<a.length();i++)
//        {
//            if(a.charAt(i)==' ' && i<a.length())
//            {
//                sb.append(a.charAt(i));
//                i++;
//                ch=Character.toUpperCase(a.charAt(i));
//                sb.append(ch);
//            }
//            else
//            {
//                sb.append(a.charAt(i));
//            }
//        }
//        System.out.println(sb);

        // String Compression
//        String str="aaaaaaaaabbbbbbbbccccccuuuuuueeee";
//        String newstr="";
//        Integer count=1;
//        for(int i=0;i<str.length();i++)
//        {
//
//            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
//            {
//                count++;
//                i++;
//            }
//            newstr+=str.charAt(i);
//            if(count>0)
//            {
//                newstr+=count.toString();
//                count=1;
//            }
//
//        }
//        System.out.println(newstr);
        /*String str1="abCDef";
        String str2="fedCba";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char [] str1tocharArray=str1.toCharArray();
            char [] str2tocharArray=str2.toCharArray();
            Arrays.sort(str1tocharArray);
            Arrays.sort(str2tocharArray);
            boolean result= Arrays.equals(str1tocharArray,str2tocharArray);
            if(result)
            {
                System.out.println("Both are anagrams "+ str1 +" & "+str2);
            }
            else
            {
                System.out.println("Both are not anagrams");
            }
        }*/
//        int t=40;
//        if(t ==30 &&t/0==4)
//        {
//            System.out.println(1);
//        }
//        else
//        {
//            System.out.println(2);
//        }

//        int arr[]={1,2,3,4,5};
//        if(isSorted(arr,0))
//        {
//            System.out.println("It is sorted!");
//        }
//        else {
//            System.out.println("it is not sorted !");
//        }
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key1=5;
        System.out.println(firstOcc(arr,0,key1,0));
    }
//    public static boolean isSorted(int arr[],int i)
//    {
//        if(i==arr.length-1)
//        {
//            return true;
//        }
//        if(arr[i]>arr[i+1])
//        {
//            return false;
//        }
//        return isSorted(arr,i+1);
//    }
    public static int firstOcc(int arr[],int i,int key1,int c)
    {
        if(i==arr.length-1)
        {
            return c;
        }
        if(arr[i]==key1)
        {
            c=i;
        }
        return firstOcc(arr,i+1,key1,c);
    }

}