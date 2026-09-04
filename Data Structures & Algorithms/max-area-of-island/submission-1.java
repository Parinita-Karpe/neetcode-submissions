class Solution {
    public int dfs(int i,int j,int[][] grid)
    {
        if(i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]==0)
        return 0;
        // if(grid[i][j]==1)return 1;
        grid[i][j]=0;
        int up=dfs(i-1,j,grid);
        int down=dfs(i+1,j,grid);
        int left=dfs(i,j-1,grid);
        int right=dfs(i,j+1,grid);
        return up+down+left+right+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0)return 0;
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    c=Math.max(c,dfs(i,j,grid));
                }
            }
        }
        return c;
    }
}
