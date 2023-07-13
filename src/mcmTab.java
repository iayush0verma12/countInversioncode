import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class mcmTab {
    public static int mcm(int arr[],int si,int ei,int dp[][])
    {

        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            dp[i][i]=0;
        }
        int len=2;
        for(len=2;len<=n-1;len++)
        {
            for(int i=1;i<=n-len;i++)
            {
                int j=i+len-1;
                dp[i][j]= Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++)
                {
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    int finalcost=cost1+cost2+cost3;
                    dp[i][j]= Math.min(dp[i][j],finalcost);
                }
            }
        }
        return dp[1][n-1];

    }
    public static void main(String[] args) {
        String fruit = ""+"potota"+ " fever"+"aa";
        System.out.println(fruit);
        int arr[]={1,2,3,4,3};
        int n=5;
        int dp[][]=new int[n][n];
        System.out.println(mcm(arr,1,arr.length-1,dp));
    }
}
