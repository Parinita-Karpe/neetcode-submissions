class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int[][] dist={{0,1},{0,-1},{1,0},{-1,0}};
        int c=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    c++;
                    q.offer(new int[]{i,j});
                    grid[i][j]='0';
                    while(!q.isEmpty())
                    {
                        int[] cell=q.poll();
                        int x=cell[0];
                        int y=cell[1];
                        for(int[] d:dist)
                        {
                            int n1=x+d[0];
                            int n2=y+d[1];
                            if(n1>=0 && n2>=0 && n1<grid.length && n2<grid[0].length && grid[n1][n2]=='1')
                            {
                                grid[n1][n2]='0';
                                q.offer(new int[]{n1,n2});
                            }

                        }

                    }
                    }
                }
        }

        return c;
    }
}
