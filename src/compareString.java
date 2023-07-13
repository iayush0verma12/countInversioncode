public class compareString {
    public static void main(String args[])
    {
        String s1="Hi my name is Ayush";
        String s2="Hi my name is Ayush";
        String s3=new String("Hi my name is Ayush");
        if(s1==s2)
        {
            System.out.println("Same");
        }
        if(s1.equals(s3))
        {
            System.out.println("S1 and S3 are same!");
        }
        else
        {
            System.out.println("S1 and S3 are not same!");
        }

    }
}