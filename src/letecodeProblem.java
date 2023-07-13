public class letecodeProblem {


    // 1035 pod

//    class Solution {
//        public int maxUncrossedLines(int[] nums1, int[] nums2) {
//            int[] dp = new int[nums2.length+1];
//
//            for(int i = 1; i <= nums1.length; i++) {
//                int[] dpRow = new int[nums2.length+1];
//                for(int j = 1; j <= nums2.length; j++) {
//                    if(nums1[i-1] == nums2[j-1]) {
//                        dpRow[j] = dp[j-1] + 1;
//                    } else {
//                        dpRow[j] = Math.max(dp[j], dpRow[j-1]);
//                    }
//                }
//                dp = dpRow;
//            }
//
//            return dp[nums2.length];
//        }
//    }

 /*   class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            // Arrays.sort(nums1);
            // Arrays.sort(nums2);
            int count=0;
            int j=0;
            int k=0;
            for(int i=0;i<nums1.length;i++)
            {
                while(j<nums2.length)
                {
                    if(nums1[i]==nums2[j])
                    {
                        count++;
                        j++;
                        k=i;
                        break;
                    }
                    j++;
                    k=i;
                    //  if(k==0)
                    //     {continue;}
                    if(j==nums2.length||j==nums2.length-1)
                    {
                        for(;k<nums1.length;k++)
                        {
                            if(nums1[k]==nums2[nums2.length-1])
                            {
                                count++;
                                j++;
                                break;
                            }

                        }
                    }
                }
            }
            return count;
        }
    }*/
 public static void main(String[] args) {
     int nums[]={32,1,2};
     int bitMask=0;
     for(int i=0;i<nums.length;i++)
     {
         bitMask=bitMask|nums[i];
     }
     System.out.println(bitMask);
 }
}