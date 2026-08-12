class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        pq.add(nums[i]);
        int i=0;
        while(i<nums.length-k)
        {
            pq.poll();
            i++;
        }
        return pq.peek();
    }
}
