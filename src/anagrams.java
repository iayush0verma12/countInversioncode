public class anagrams{
    public static boolean checkAnagram(String str1,String str2)
    {
        int n=str1.length();
        int m=str2.length();

        int j=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(j=0;j<m;j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    count++;
                }

            }
            if(j==m && count==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str1="manmgoo";
        String str2="oognamm";
        if(checkAnagram(str1, str2))
        {
            System.out.print("It is a Anagram!");
        }
        else
        {
            System.out.println("Not a Anagram!");
        }
    }
}