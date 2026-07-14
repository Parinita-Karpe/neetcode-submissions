class Solution {
    public int mincost(int[] cost,int[] dp,int n)
    {
        // if(n0)return 0;
        if(n<=1)return 0;
        if(dp[n]!=-1)return dp[n];
        // int step1=0,step2=0;
        int step1=cost[n-1]+mincost(cost,dp,n-1);
        int step2=cost[n-2]+mincost(cost,dp,n-2);
        return dp[n]=Math.min(step1,step2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        int ans=mincost(cost,dp,n);
        return ans;
    }
}
