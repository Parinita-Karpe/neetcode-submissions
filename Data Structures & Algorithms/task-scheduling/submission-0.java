class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(char c:tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i:map.values())
        {
            maxheap.add(i);
        }
        
        int time=0;
        while(!maxheap.isEmpty())
        {
            int cycle=n+1;
            
            List<Integer> ans=new ArrayList<>();
            while(cycle>0 && !maxheap.isEmpty())
            {
                int curr= maxheap.poll();
                curr--;
                if(curr>0)
                ans.add(curr);
                time++;
                cycle--;
                
            }
            for(int i:ans)
            maxheap.add(i);

            if(!maxheap.isEmpty())
            time+=cycle;

        }
    return time;
    }
}
