import java.util.Arrays;
import java.util.Locale;

public class anagram2 {
    public static boolean checkAnagram(String str1,String str2)
    {
       str1= str1.toLowerCase();
       str2= str2.toLowerCase();
       if(str1.length()== str2.length())
       {
        char[] str1charArray= str1.toCharArray();
        char[] str2charArray= str2.toCharArray();
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
        boolean result=Arrays.equals(str1charArray,str2charArray);
        if(result)
        {
            return true;
        }
        else
        {
            return false;
        }
       }
       else
       {
           return false;
       }
    }
    public static void main(String[] args) {
        String str1="Apple";
        String str2="apPle";
        if(checkAnagram(str1,str2))
        {
            System.out.println("It is a Anagram");
        }
        else
        {
            System.out.println("It is not a Anagram");
        }
    }
}