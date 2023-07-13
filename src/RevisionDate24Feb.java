import java.util.ArrayList;
import java.util.Collections;

public class RevisionDate24Feb {
    /*public static void swap(ArrayList<Integer>list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }*/
   /* public static boolean TargetExists(ArrayList<Integer>height,int target)
    {
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                if(height.get(i)+height.get(j)==target)
                {
                   return true;
                }
            }
        }
        return false;
    }*/
    public static boolean TargetExists(ArrayList<Integer>height,int target)
    {
        int bp=-1;
        for(int i=0;i<height.size();i++)
        {
            if(height.get(i)>height.get(i+1))
            {
                bp=i;
                break;
            }
        }
       int lp=bp;int rp=bp-1;
       int n=height.size();
       while(lp!=rp)
       {
           if(height.get(lp)+height.get(rp)==0)
           {
               return true;
           }
           if(height.get(lp)+height.get(rp)<target)
           {
               /*lp++;*/
               lp=(lp+1)%n;
           }
           else
           {
               rp=(n+rp-1)%n;
               /*rp--;*/
           }
       }
       return false;
    }
    public static void main(String[] args) {
        /*ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }*/
        /*ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }*/

        /*ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);*/
        /*int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);*/
        /*int idx1=1;
        int idx2=3;
        swap(list,idx1,idx2);
        System.out.println(list);*/
        /*Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);*/
        /*ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);list.add(2);
        mainList.add(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(4);list2.add(5);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>currList=mainList.get(i);
            for(int j=0;j<currList.size();j++)
            {
                System.out.print(currList.get(j)+" ");
            }
        }*/

        //Container With Most Water
        //ArrayList
        //two loops
        //max calculate
        // return max, print value of max

        ArrayList<Integer>height=new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        /*int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int minHeight=Math.min(height.get(i),height.get(j));
                int width=j-i;
                maxWater=Math.max(maxWater,minHeight*width);
            }
        }
        System.out.print(maxWater);*/

        //Two Pointer Approach
        /*int maxWater=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);
            if(height.get(lp)>height.get(rp))
            {
                rp--;
            }
            else
            {
                lp++;
            }
        }
        System.out.println(maxWater);*/
        int target=19;
        //Pair Sum Brute Force
        if(TargetExists(height,target))
        {
            System.out.print("Yes The Target Exists!");
        }
        else
        {
            System.out.print("Target does not Exists!");
        }

    }
}