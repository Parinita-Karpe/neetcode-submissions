class Solution {
    public int search(int[] nums, int target) {
        int beg=0,end=nums.length;
        while(beg<end)
        {
            int mid=(beg+end)/2;
            if(target==nums[mid])return mid;
            else if(target>nums[mid])beg=mid+1;
            else if(target<nums[mid])end=mid;
        }
        return -1;
    }
}
