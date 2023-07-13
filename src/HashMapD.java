import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.*;

public class HashMapD {

    public static void main(String[] args) {
        //create a hashmap
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("Apple",2);
//        hm.put("Bananas",3);
//        hm.put("PineApple",4);
//        hm.put("Pomegranate",5);
//
//        TreeMap<String,Integer> tm = new TreeMap<>();
//        tm.put("India",1);
//        tm.put("Pakistan",2);
//        tm.put("China",3);
//        tm.put("Bhutan",4);
//        System.out.println(tm);
//        int numberApple=hm.get("Apple");
//        System.out.println(numberApple);
//        if(hm.containsKey("Apple"))
//        {
//            System.out.println("It contains the key!");
//        }
//        else {
//            System.out.println("It does not contains the key!");
//        }
//
//        System.out.println(hm.remove("Apple"));
//        System.out.println(hm.containsKey("Apple"));
//        System.out.println(hm.size());
//        System.out.println(hm.isEmpty());
//        System.out.println(hm);
//        Set<String> keys = hm.keySet();
//        System.out.println(keys);
//        hm.entrySet();
//        for(String k:keys)
//        {
//            System.out.println(" key :"+ k + " , value :"+hm.get(k));
//        }
//
//
//
//        HashSet<String>cities = new HashSet<>();
//        cities.add("Patna");
//        cities.add("delhi");
//        cities.add("punjab");
//        cities.add("gurugram");
//        cities.add("bengaluru");
//        Iterator it =  cities.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//
//        for(String city:cities)
//        {
//            System.out.println(city);
//        }
//        HashMap<Integer,Integer>hw=new HashMap<>();
//
//
//        HashSet<Integer> hm = new HashSet<>();
//        HashSet<Integer> hs = new HashSet<>();
//
//        int count =0;
////        {4,3,2,5,6,7,3,4,2,1}
//        int arr1[]={7,3,9};
//        int arr2[]={6,3,9,2,9,4};
//        for(int i=0;i<arr1.length;i++)
//        {
//            hm.add(arr1[i]);
//        }
//        for(int j=0;j<arr2.length;j++)
//        {
//            hm.add(arr2[j]);
//        }
//        System.out.println("Union is " +hm);
//// intersection
//        hm.clear();
//
//        for(int i=0;i<arr1.length;i++)
//        {
//            hm.add(arr1[i]);
//        }
//        for(int j=0;j<arr2.length;j++)
//        {
//            hs.add(arr2[j]);
//        }
////        for(int i=0;i<arr2.length;i++)
////        {
////            if(hm.contains(arr2[i]))
////            {
////                count++;
////                System.out.print(arr2[i]+" ");
////                hm.remove(arr2[i]);
////            }
////        }
//
//        hm.retainAll(hs);
//        System.out.println("Interection of the two sets is "+hm);

        int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        HashSet<Integer>hm=new HashSet<>();
        HashSet<Integer>hw=new HashSet<>();
        //cannot include 0 because keys are unique

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    hm.add(i);
                    hw.add(j);
                }
            }
        }
        System.out.println(hm);

        for(int i=0;i<matrix.length;i++)
        {
            if(hm.contains(i))
            {
                for(int m=0;m<matrix[0].length;m++)
                {
                    matrix[i][m]=0;
                }
            }
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            if(hw.contains(j))
            {
                for(int n=0;n<matrix.length;n++)
                {
                    matrix[n][j]=0;
                }
            }

        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
