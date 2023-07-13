public class findSubSets {
    public static void findSubSets(String str,int i,String ans)
    {
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.print("null"+" ");
            }
            else
            {
                System.out.print(ans+" ");
            }
            return;
        }
        findSubSets(str,i+1,ans+str.charAt(i));
        findSubSets(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubSets(str,0,"");
    }
}