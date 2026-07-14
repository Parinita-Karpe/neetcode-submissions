class Solution {
    public int helper(int[] nums)
    {
        int n=nums.length;
        if(n<2)return nums[0];
        int[] dp=new int[n];
       dp[0]=nums[0];
       dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        // if(nums.length==2)return Math.max(nums[0],nums[1]);
     if(nums.length<2)return nums[0];
        int n=nums.length;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        for(int i=0;i<nums.length-1;i++)
        {
            dp1[i]=nums[i];
            dp2[i]=nums[i+1];
        }
        int m1=helper(dp1);
        int m2=helper(dp2);
        return Math.max(m1,m2);
    }
}
