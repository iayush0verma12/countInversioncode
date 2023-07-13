public class QuestionOnBitManipulation {
    public static void main(String args[])
    {
        for(char ch='A';ch<='Z';ch++)
        {
            System.out.print((char)(ch|' '));
        }
        int x=7;
        System.out.println("\n"+-~x);
    }
}