class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int[] point:points)
        {
            int x=point[0];
            int y=point[1];
            int dist=x*x+y*y;
            pq.add(new int[]{dist,x,y});
        }
        int[][] res=new int[k][2];
        int i=0;
        while(i<k)
        {
            int[] curr=pq.poll();
            res[i][0]=curr[1];
            res[i][1]=curr[2];
            i++;
        }
        return res;
    }
}
