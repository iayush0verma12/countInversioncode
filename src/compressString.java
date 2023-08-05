public class compressString {
    public static void compressString(String str)
    {
        String newStr="";

        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1)
            {
                newStr+=count.toString();
            }
        }
        System.out.println(newStr);
    }
    public static void main(String args[])
    {
        String str="AAAABBBBCCEEEDDDDD";
        System.out.println(str);
        compressString(str);
    }
}


/*
class CircularArrayQueue {
    public int compress(char[] chars) {
        int i=0,k=0;
        while(i<chars.length){
            int j=i;
            while(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            chars[k]=chars[i];
            k++;
            if((j-i)>1){
                String s = String.valueOf(j-i);
                for(int x=0;x<s.length();x++){
                    chars[k++]=s.charAt(x);
                }
            }
            i=j;
        }
        return k;
    }
    }*/
