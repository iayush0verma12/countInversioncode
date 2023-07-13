public class removeDuplicate {
    public static void removeDuplicateFrom(String str,StringBuilder newStr,boolean map[],int idx)
    {
        //base
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            removeDuplicateFrom(str,newStr,map,idx+1);
        }
        else
        {
            map[currChar-'a']=true;
            removeDuplicateFrom(str,newStr.append(currChar),map,idx+1);
        }
        //kaam
        //calling function
    }
    public static void main(String args[])
    {
        String str="aabbccdefgh";
        removeDuplicateFrom(str,new StringBuilder(""),new boolean[26],0);
    }
}