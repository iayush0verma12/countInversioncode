public class countInversion {
    public static int mergeSort(int arr[],int si,int ei)
    {
        int inv=0;
        if(ei>si) {
            int mid = si + (ei - si) / 2;
            inv += mergeSort(arr, si, mid);
            inv += mergeSort(arr, mid + 1, ei);
            inv += merge(arr, mid, si, ei);
        }

        return inv;
    }

    public static int merge(int arr[],int mid,int si,int ei) {
        int inv=0;
        int n1 = mid - si + 1;
        int n2 = ei - mid;
        int a[] = new int[n1];
        int b[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[si+i];
        }
        for(int j=0;j<n2;j++)
        {
            b[j]=arr[j+mid+1];
        }
        int i=0,j=0,k=si;
        while(i<n1&& j<n2)
        {
            if(a[i]>b[j])
            {
                arr[k]=b[j];
                inv+=n1-i;
                j++;k++;
            }
            else
            {
                arr[k]=a[i];
                i++;k++;
            }

        }

        while(i<n1)
        {
            arr[k++]=a[i++];
        }
        while(j<n2)
        {
            arr[k++]=b[j++];
        }

        return inv;
    }
    public static int countInv(int arr[])
    {
        return mergeSort(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        //mergeSort
        int arr[]={2,3,5,3,5,6,4};
        System.out.println( countInv(arr));
    }
}