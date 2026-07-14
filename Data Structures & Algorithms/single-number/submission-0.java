class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int key:freq.keySet())
        {
            if(freq.get(key)==1)
            ans=key;
        }
        return ans;
    }
}
