public class spiral2 {
    public static void main(String[] args) {
        int nums1[]={2,5,1,2,5};
        int nums2[]={10,5,2,1,5,2};
        int count=0;
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            while(j<nums2.length)
            {
                if(nums1[i]==nums2[j])
                {
                    count++;
                    j=j+1;
                    break;
                }
            }
        }
    }
}