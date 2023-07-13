public class sameCharecter {
    public static void printSame(String str,int i)
    {
        if(i==str.length()-1)
        {
            return;
        }
        int j=0;
        for(j=i+1;j<str.length();j++)
        {
            if(str.charAt(j)==str.charAt(0))
            {
                break;
            }
            else
            {
                System.out.print(str.charAt(j));
            }
        }
        String substr="";
        for(;i<=j;i++)
        {
            substr+=str.charAt(i);
        }
       printSame(str,i+1);
    }
    public static void main(String args[])
    {
        String str="abcdabcd";
        printSame(str,0);
    }
}