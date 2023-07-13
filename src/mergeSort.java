public class mergeSort {
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;//index for 1st or left sorted part
        int j=mid+1;//index for Right sorted part
        int k=0;//index for temp variable
        while(i<=mid&&j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part if any element is left
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        //right part if any element is left
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //copy this temp to the original string
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }

    }
    public static void main(String args[])
    {
        int arr[]={5,987,7,8,133,23,45,69};
        System.out.println("Array Before Sort is -");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array After Sort is - ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}