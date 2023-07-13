public class lengthOfAString {
    public static int calculateLength(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }
        return calculateLength(str.substring(1))+1;
    }
    public static void main(String args[])
    {
        String str="helloWorld";
        int c=calculateLength(str);
        System.out.print(c);
    }
}