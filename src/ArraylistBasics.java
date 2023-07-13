import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.swap;

public class ArraylistBasics {
    /*public static void swapArray(ArrayList<Integer>list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        *//*list.get(idx1)=list.get(idx2);
        list.get(idx2)=temp;*//*
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }*/
    public static void main(String[] args) {
        /*ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }*/
        /*ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }*/
        /*ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);*/
        /*ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        int idx1=1;
        int idx2=3;
        swapArray(list,idx1,idx2);
        System.out.println(list);*/

        //Performing collections . sort
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(7);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}