class Solution {
    public int maxmoney(int[] nums,int[] dp,int n)
    {
        if(n<1)return 0;
        if(n==1)return nums[0];
        if(dp[n]!=-1)return dp[n];
        int h1=nums[n-1]+maxmoney(nums,dp,n-2);
        int skip=maxmoney(nums,dp,n-1);
        return dp[n]=Math.max(h1,skip);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int n=nums.length;
        if(n==2)return Math.max(nums[0],nums[1]);
        if(n==1)return nums[0];
        int ans=maxmoney(nums,dp,n);
        return ans;
    }
}
