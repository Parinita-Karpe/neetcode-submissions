class Solution {
    public void islandsAndTreasure(int[][] grid) {
        if(grid.length==0)return;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                q.offer(new int[]{i,j});
            }
        }
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            int[] cell=q.poll();
            int i=cell[0];
            int j=cell[1];
            for(int[] d:dir)
            {
                int n1=i+d[0];
                int n2=j+d[1];
                if(n1>=0 && n2>=0 && n1<grid.length && n2<grid[0].length && grid[n1][n2]==Integer.MAX_VALUE)
                {
                    grid[n1][n2]=grid[i][j]+1;
                    q.offer(new int[]{n1,n2});
                }
            }
        }
        return;
    }
}
