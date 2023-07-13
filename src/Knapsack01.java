public class Knapsack01 {
    public static int knapsackZeroOne(int val[],int wt[],int W,int n,int dp[][])
    {
        if(W==0||n==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        if(wt[n-1]<=W)
        {
            //include
            int ans1=val[n-1]+knapsackZeroOne(val,wt,W-wt[n-1],n-1,dp);
            //exclude
            int ans2=knapsackZeroOne(val,wt,W,n-1,dp);
            dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W];
        }
        else {
            dp[n][W]= knapsackZeroOne(val,wt,W,n-1,dp);
            return dp[n][W];
        }

    }
    public static int knapsackTabulation(int val[],int wt[],int W)
    {
        // length of val or wt
        // base case 0 pe value 0 hai
        //dp initilize
        //make first row and column equal to zero coz n==0 or W==0 (j==0) have the same meaning
        //for loop nested i 1->n+1 j 1->W+1
           // v=val[i-1] w=j-1;
             // make two cases every time
                 //if(w<j)
                // include val[i-1]+call dp[i-1][j-w]
                    //exclude then call dp[i-1][j]
               // store it in the dp after cal max of above two
                // exclude then call dp[i-1][j]
              // store it in the dp after calculating max
         //return dp[n][W]

        int n= val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            int w=wt[i-1];
            int v=val[i-1];
            for(int j=1;j<W+1;j++)
            {
                if(w<=j)
                {
                    int incMax=v+dp[i-1][j-w];
                    int exMax = dp[i-1][j];
                    dp[i][j]=Math.max(incMax,exMax);
                }
                else {
                    int exMax=dp[i-1][j];
                    dp[i][j]=exMax;
                }
            }
        }

        for(int i=0;i< dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(dp[i][j]==0)
                {
                    System.out.print(dp[i][j]+"  ");
                }
                else {
                    System.out.print(dp[i][j] + " ");
                }
            }
            System.out.println();
        }
        return dp[n][W];


    }

    public static int KnapsackTabulationUnbound(int val[],int wt[],int W)
    {
        // length of val or wt
        // base case 0 pe value 0 hai
        //dp initilize
        //make first row and column equal to zero coz n==0 or W==0 (j==0) have the same meaning
        //for loop nested i 1->n+1 j 1->W+1
        // v=val[i-1] w=j-1;
        // make two cases every time
        //if(w<j)
        // include val[i-1]+call dp[i-1][j-w]
        //exclude then call dp[i-1][j]
        // store it in the dp after cal max of above two
        // exclude then call dp[i-1][j]
        // store it in the dp after calculating max
        //return dp[n][W]

        int n= val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            int w=wt[i-1];
            int v=val[i-1];
            for(int j=1;j<W+1;j++)
            {
                if(w<=j)
                {
                    dp[i][j]=Math.max(v+dp[i][j-w],dp[i-1][j]);
                }
                else {
                    int exMax=dp[i-1][j];
                    dp[i][j]=exMax;
                }
            }
        }

        for(int i=0;i< dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(dp[i][j]==0)
                {
                    System.out.print(dp[i][j]+"  ");
                }
                else {
                    System.out.print(dp[i][j] + " ");
                }
            }
            System.out.println();
        }
        return dp[n][W];


    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
//        int dp[][]= new int[val.length+1][W+1];
//        for(int i=0;i<dp.length;i++)
//        {
//            for(int j=0;j<dp.length;j++)
//            {
//                dp[i][j]=-1;
//            }
//        }
//        System.out.println(knapsackTabulation(val,wt,W));
        System.out.println(KnapsackTabulationUnbound(val,wt,W));
    }
}
