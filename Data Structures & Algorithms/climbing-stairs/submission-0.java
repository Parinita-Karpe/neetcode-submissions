class Solution {
    public int steps(int[] dp,int n,int i)
    {
        if(n==0)return 1;
        if(n<0)return 0;
        if(dp[i]!=-1)return dp[i];
        int step1=steps(dp,n-1,i+1);
        int step2=steps(dp,n-2,i+2);
        return dp[i]=step1+step2;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return steps(dp,n,0);
    }
}
