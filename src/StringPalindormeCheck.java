import javax.swing.*;
import java.util.Scanner;

public class StringPalindormeCheck{
    //Optimized Code
    public static boolean checkPalindrome(String name)
    {
        int n=name.length();
        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)!=name.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    //Not a Optimized code
  /*  public static boolean checkPalindrome(String name)
    {
        int start=0;
        int end=name.length()-1;
        while(start<=end)
        {
            if(name.charAt(start)!=name.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }*/
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        if(checkPalindrome(name))
        {
            System.out.println("It is a Palindrome!");
        }
        else
        {
            System.out.println("It is not a palindrome!");
        }
    }
}