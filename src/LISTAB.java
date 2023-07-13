import java.util.Arrays;
import java.util.HashSet;

public class LISTAB {
        public static int LIS(int arr[],int arr2[],int n,int m,int dp[][])
        {
            for(int i=0;i<dp.length;i++)
            {
                for(int j=0;j<dp[0].length;j++)
                {
                    if(i==0||j==0)
                    {
                        dp[i][j]=0;
                    }
                }
            }
            for(int i=1;i<n+1;i++)
            {
                for(int j=1;j<m+1;j++)
                {
                    if(arr[i-1]==arr2[j-1])//comparing the last character
                    {
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else {
                        int ans1=dp[i-1][j];
                        int ans2=dp[i][j-1];
                        int max=Math.max(ans1,ans2);
                        dp[i][j]=max;
                    }
                }
            }
            return dp[n][m];

        }
       // public static int lis(int arr[])
//        {
//            HashSet<Integer> hs =new HashSet<>();
//            for(int i=0;i<arr.length;i++)
//            {
//                hs.add(arr[i]);
//            }
//            int arr2[]=new int[hs.size()];
//            int i=0;
//            for(int num:hs)
//            {
//                arr2[i]=num;
//                i++;
//            }
//
//            for(i=0;i<arr2.length;i++)
//            {
//                System.out.print(arr2[i]+ " ");
//            }
//            return LIS(arr,arr2,arr.length,arr2.length);
//        }


    public static void main(String[] args) {
        int arr[]={3,6,9,12};
        int arr2[]=new int[arr.length];
        int k=0;
        for(int num:arr)
        {
            arr2[k]=num;
            k++;
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        int n=arr.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(LIS(arr,arr2,n,m,dp));//Use HashSet for Duplicate cases
    }

}
