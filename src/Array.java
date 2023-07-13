import java.util.*;
public class Array {

    //2.0 array updation
    /* public static void update(int marks[],int nonchangable)
    {
        nonchangable=10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }*/
    public static int linearSearch(int marks[],int key)
    {
        for(int i=0;i<marks.length;i++)
        {
            if(key==marks[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        // 1.0 HOW TO TAKE INPUT
        /*int marks[] = new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Marks of phy is "+marks[0]);
        System.out.println("Marks of chem is "+marks[1]);
        System.out.println("MArks of maths is "+marks[2]);
        System.out.println("Length of Array is "+marks.length);*/

        // 2.0 ARRAY UPDATION
        /*int marks[]={4,5,6,7};
        int nonchangable=5;
        System.out.println("Before Updation");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }
        System.out.println();
        update(marks,nonchangable);
        System.out.println("After Updation");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }
        System.out.println();
        System.out.println("Value of Non Changable changes to "+nonchangable);*/
        int marks[]={1,2,3,4,5,7};
        int key=5;
        int index= linearSearch(marks,key);
        if(index==-1)
        {
            System.out.println("Item not Found !");
        }
        else
        {
            System.out.println("Item is found at "+index);
        }
    }
}