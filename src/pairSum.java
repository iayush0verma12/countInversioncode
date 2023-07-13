import java.util.ArrayList;

public class pairSum {
    public static boolean pairSum1(ArrayList<Integer>list,int target)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(Math.abs(list.get(i)-list.get(j))==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(80);
        int target=78;
        System.out.println(pairSum1(list,target));
    }
}