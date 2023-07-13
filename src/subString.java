/*
public class subString{
    public static String SubString(String str,int si,int ei)
    {
        String substr="";
        for(int i = si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="helloWorld";
        System.out.println(SubString(str,0,5));
    }
}*/

import java.util.Scanner;

public class subString{
    public static void printSubString(int si,int ei,String str)
    {
        String subStr="";
        for(int i=si;i<=ei;i++)
        {
            subStr+=str.charAt(i);
        }
        System.out.println(subStr);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=new String(sc.nextLine());
        printSubString(0,5,str);
    }
}