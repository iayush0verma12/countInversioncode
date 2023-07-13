import java.util.ArrayList;
import java.util.Objects;

public class HeapDemos {
//    static class Heap{
//        ArrayList<Integer> arr = new ArrayList<>();
//        public void addHeap(int data)
//        {
//            arr.add(data);
//            int x= arr.size()-1;
//            int par=(x-1)/2;
//            while(arr.get(x)<arr.get(par))
//            {
//                //swap
//                int temp=arr.get(x);
//                arr.set(x, arr.get(par));
//                arr.set(par,temp);
//            }
//        }
//        public int peek()
//        {
//            return arr.get(0);
//        }
//        private void heapify(int i)
//        {
//            int left =2*i+1;
//            int right = 2*i+2;
//            int minIdx = i;
//            if(left < arr.size() && arr.get(minIdx) > arr.get(left))
//            {
//                minIdx=left;
//            }
//            if(right<arr.size() && arr.get(minIdx)>arr.get(right))
//            {
//                minIdx=right;
//            }
//            if(i!=minIdx)
//            {
//                int temp=arr.get(i);
//                arr.set(i,arr.get(minIdx));
//                arr.set(minIdx,temp);
//                heapify(minIdx);
//            }
//
//        }
//        public int delete(){
//            int data= arr.get(0);//getting index of the root
//            // Swap first and the last index
//            int temp=arr.get(0);
//            arr.set(0,arr.get(arr.size()-1));
//            arr.set(arr.size()-1,temp);
//            //delete last elemet
//            arr.remove(arr.get(arr.size()-1));
//            //heapify
//            heapify(0);
//            return data;
//        }
//
//        public boolean isEmpty()
//        {
//            return arr.size()==0;
//        }
//    }
    public static void heapify(int arr[],int i,int size)
    {
        int left= 2*i+1;
        int right = 2*i+2;
        int maxIdx=i;
        if(left<size && arr[left]>arr[maxIdx])
        {
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx])
        {
            maxIdx=right;
        }

        if(maxIdx!=i)
        {
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,maxIdx,size);
        }

    }
    public static void heapSort(int arr[])
    {
        int n= arr.length;
        //heapify all except the leave nodes
        for(int i=n/2;i>=0;i--)
        {
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);
        }



    }


    public static void main(String[] args) {

//        Heap h = new Heap();
//        h.addHeap(2);
//        h.addHeap(3);
//        h.addHeap(4);
//        h.addHeap(5);
//        h.addHeap(10);
//        h.addHeap(6);
//
//        while(!h.isEmpty())
//        {
//            System.out.print(h.peek()+" ");
//            h.delete();
//        }

        int arr[]={1,2,4,5,3};
        heapSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
