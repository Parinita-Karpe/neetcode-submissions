class Solution {
    public void dfs(int[] visited,int i,List<List<Integer>> adj)
    {
        if(visited[i]==1)return;
        visited[i]=1;
        for(int j:adj.get(i))
        dfs(visited,j,adj);
    }
    public int countComponents(int n, int[][] edges) {
        Queue<Integer> q=new LinkedList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int[] edge:edges)
        {
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int c=0;
        int[] visited=new int[n];
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0)
            {
                dfs(visited,i,adj);
                c++;
            }
        }
        return c;
    }
}
