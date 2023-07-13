import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[])
    {
//        ArrayList<Integer>list=new ArrayList<>();
//        ArrayList<String>list2=new ArrayList<>();
//        ArrayList<Boolean>list3=new ArrayList<>();
//        //Adding elements into the array list
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(2,11);
//        System.out.println(list);
//        int element=list.get(2);
//        System.out.println(element);
//        //Get any Element into the array list
//        int getNumber=list.get(1);
//        System.out.println(getNumber);
//        //Remove Any element from the Array
//        System.out.println(list.contains(3));
//        System.out.println(list.contains(6));
//        //Set any element
//        System.out.println(list.set(2,10));
//        list.remove(1);
//        System.out.println(list);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(56);
        list.add(18);
        list.add(32);
        list.add(542);
        //Print Reverse of the String
        /*for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();*/

       /* int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            *//*if(max<list.get(i))
            {
                max=list.get(i);
            }*//*
            max=Math.max(max,list.get(i));
        }
        System.out.println("Max value of the given list is : "+max);*/
        //Sorting in Ascending Order
        Collections.sort(list);
        System.out.println(list);
        //Sorting in Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}