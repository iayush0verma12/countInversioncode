import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
public class kadanesAlgorithm {
    public static void kadane(int numbers[])
    {
       int ms=Integer.MIN_VALUE;
       int max=numbers[0];
       int cs=0;
       for(int i=1;i<numbers.length;i++)
       {
           if(numbers[i]>0)
           {break;}
           if(numbers[i]>=max)
           {
               max=numbers[i];
           }
       }
       if(max<0)
       {System.out.println("MAX SUM SUB ARRAY IS"+max);}
       for(int i=0;i<numbers.length;i++)
       {
           cs=cs+numbers[i];
           if(cs<0)
           {
               cs=0;
           }
           ms=Math.max(cs,ms);
       }
       System.out.println("Max Sub Array is "+ms);
    }

    public static void main(String args[])
    {
        int numbers[]={-3,-4,-6,-8,-2,-5,-9};
        kadane(numbers);
    }
}*/
public class kadanesAlgorithm {
//    public static void kadaneAlgorithm(int numbers[])
//    {
//        int ms=Integer.MIN_VALUE;
//        int n=numbers.length;
//        int cs=0;
//        for(int i=0;i<n;i++)
//        {
//            cs=cs+numbers[i];
//            ms=Math.max(cs,ms);
//            if(cs<0)
//            {
//                cs=0;
//            }
//        }
//        System.out.print("Max Sub Array is"+ms);
//    }

    public static void kadaneAlgorithm(List<Integer>inputArray)
    {
        int ms=Integer.MIN_VALUE;
        int n=inputArray.size();
        int cs=0;
        for(int i=0;i<n;i++)
        {
            cs=cs+inputArray.get(i);
            ms=Math.max(cs,ms);
            if(cs<0)
            {
                cs=0;
            }
        }
        System.out.print("Max Sub Array is"+ms);
    }
    public static int findKthLargestInArray(List<Integer> inputArray, int k) {
        PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);

        for(int el : inputArray) {
            largeK.add(el);
            if (largeK.size() > k) {
                largeK.poll();
            }
        }

        return largeK.poll();

    }

   public static void main(String args[])
   {
       int numbers[]={1,2,3,4,5,6,7,8,19};
       List<Integer> inputArray= new ArrayList<>();
       inputArray.add(1);
       inputArray.add(2);
       inputArray.add(3);
       inputArray.add(4);
       inputArray.add(5);
       inputArray.add(6);
       inputArray.add(7);
       inputArray.add(8);
       inputArray.add(19);
       int k=3;
       System.out.println(findKthLargestInArray(inputArray,k));
   }
}
