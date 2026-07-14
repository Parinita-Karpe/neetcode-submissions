class Solution {
    public boolean helper(int i,int target,int[] nums,Boolean[][] dp)
    {
        if(target==0)return true;
        if(i==nums.length|| target<0)return false;
        if(dp[i][target]!=null)return dp[i][target];
        boolean take=helper(i+1,target-nums[i],nums,dp);
        boolean nottake=helper(i+1,target,nums,dp);
        return dp[i][target]=take || nottake;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        sum/=2;
        Boolean[][] dp=new Boolean[n][sum+1];
        boolean ans=helper(0,sum,nums,dp);
        return ans;
    }
}
