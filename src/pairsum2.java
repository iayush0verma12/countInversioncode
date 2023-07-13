import java.util.ArrayList;

public class pairsum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target)
    {
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++) {
            if (list.get(i) > list.get(i + 1))
            {
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;

        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else
            {
                rp=(rp+n-1)%n;
            }


        }

        return false;

    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(2);
        int target=3;
        System.out.println(pairSum2(list,target));



//        class Solution {
//            public boolean search(int[] nums, int target) {
//
//                //breaking point
//                int pivot=0;
//                for(int i=0;i<nums.length-1;i++)
//                {
//                    if(nums[i]>nums[i+1])
//                    {
//                        pivot=i;
//                        break;
//                    }
//                }
//
//                int a=binarySearch(nums,0,pivot,target);
//                if(a>=0)
//                {
//                    return true;
//                }
//                a=binarySearch(nums,pivot+1,nums.length-1,target);
//                if(a>0)
//                {
//                    return true;
//                }
//                return false;
//            }
//            int binarySearch(int nums[],int l,int r,int target)
//            {
//                while(l<=r)
//                {
//                    int mid=(l+r)/2;
//                    if(nums[mid]==target)
//                    {
//                        return mid;
//                    }
//                    else if(nums[mid]<target)
//                    {
//                        l=mid+1;
//                    }
//                    else
//                    {
//                        r=mid-1;
//                    }
//                }
//                return -1;
//            }
//        }
//
//
//
//
//


        
    }
}