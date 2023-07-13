/*
public class findFirstOccurence {
    public static int findFirst(int arr[],int i,int key)
    {
        if(i==arr.length-1)
        {
            if(arr[i]==key)
            {
                return i;
            }
            else
            {
                return -1;
            }
        }
        if(arr[i]==key)
        {
            return i;
        }

        return findFirst(arr,i+1,key);
    }

    public static void main(String args[])
    {
        int arr[]={1,2,9,4,5,6,7,8,9};
        int key=9;
        int i=0;
        System.out.println(findFirst(arr,i,key));
    }
}*/
public class findFirstOccurence {
    public static int findFirst(int arr[],int i,int key)
    {
       int isFound=findFirst(arr,i+1,key);
        if(i==arr.length-1)
        {
            return -1;
        }
       if(isFound==-1&&arr[i]==key)
       {
           return i;
       }
       return isFound;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,9,4,5,6,5,8,9};
        int key=5;
        int i=arr.length-1;
        System.out.println(findFirst(arr,i,key));
    }
}
