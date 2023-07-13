public class DNCQ1 {
    public static void mergeSort(String arr[],int si,int ei)
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
    public static void merge(String arr[],int si,int mid,int ei)
    {
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i].charAt(i)<arr[j].charAt(j))
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //copy to temp
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
    public static void main(String args[])
    {
        String arr[]={"Sun","Earth","Mars","Mercury"};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
