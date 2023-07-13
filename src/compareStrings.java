import java.awt.image.AbstractMultiResolutionImage;

public class compareStrings {
    public static void main(String args[])
    {
        /*String fruit[]={"apple","manforce","manfg","mango","banana"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++)
        {
            if(largest.compareTo(fruit[i])<0)
            {
                largest=fruit[i];
            }
        }
        System.out.println(largest);*/
       StringBuilder sb=new StringBuilder("");
       for(char ch='a';ch<='z';ch++)
       {
           sb.append(ch);
       }
       System.out.println(sb);

    }
}