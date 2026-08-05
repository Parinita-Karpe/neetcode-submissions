class Solution {
    public void helper(List<List<Integer>> res,int[] nums,List<Integer> ds,int i)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
            while(i+1<nums.length && nums[i]==nums[i+1])
            i++;
            ds.add(nums[i]);
            helper(res,nums,ds,i+1);
            ds.remove(ds.size()-1);
            helper(res,nums,ds,i+1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,nums,new ArrayList<>(),0);
        return res;
    }
}
