public class mcmRecursion {
    public static int mcm(int arr[],int si,int ei)
    {
        int k=0;
        if(si==ei)
        {
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(k=si;k<=ei-1;k++)
        {
            int cost1=mcm(arr,si,k);
            int cost2=mcm(arr,k+1,ei);
            int cost3=arr[si-1]*arr[k]*arr[ei];
            int finalcost=cost1+cost2+cost3;
            ans= Math.min(ans,finalcost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=5;
        System.out.println(mcm(arr,1,arr.length-1));
    }
}
