class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> check:map.entrySet())
        {
            if(check.getValue()>1)
            res=check.getKey();
        }
        return res;
    }
}
