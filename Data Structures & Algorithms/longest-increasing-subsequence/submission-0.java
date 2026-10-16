class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tail=new int[nums.length];
        // dp[0]=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            int left=0,right=len;
            while(left<right)
            {
                int mid=(left+right)/2;
                if(tail[mid]<nums[i])
                left=mid+1;
                else
                right=mid;
            }
            tail[left]=nums[i];
            if(len==left)
            len++;

        }
        return len;
    }
}
