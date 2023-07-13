import java.util.ArrayList;
import java.util.HashMap;

public class mobileCombination {
    static ArrayList<String>al=new ArrayList<>();
    public static void makeCombination(int i,int j,HashMap<Integer,String>hs)
    {
        if(i==8 |i==9|j==8|j==9)
        {
            return;
        }
        String a=hs.get(i);
        String b=hs.get(j);
        int m=0;

        for(int k=0;k<=a.length()-1;k++)
        {
            while(m<=b.length()-1)
            {
                String v="";
                v+=a.charAt(k);
                v+=b.charAt(m);
                al.add(v);
                m++;
            }
        }
//        return;
    }
    public static void getList(HashMap<Integer,String>hs)
    {
        for(int i=2;i<=9;i++)
        {
            for(int j=3;j<=9;j++)
            {
                makeCombination(i,j,hs);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,String>hs=new HashMap<>();
//        hs.put(1,"abc");
        hs.put(2,"abc");
        hs.put(3,"def");
        hs.put(4,"ghi");
        hs.put(5,"jkl");
        hs.put(6,"mno");
        hs.put(7,"pqr");
        hs.put(8,"stu");
        hs.put(9,"vwxyz");
        getList(hs);
        System.out.println(al);

    }
}
