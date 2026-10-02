class Solution {
    public boolean iscycle(int i,int j,int[] visited,List<List<Integer>> adj)
    {
        if(i==j)return true;
        visited[i]=1;
        for(int m:adj.get(i))
        {
            if(visited[m]==0)
            {
                if(iscycle(m,j,visited,adj))
                return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=edges.length;i++)
        adj.add(new ArrayList<>());
        for(int[] edge:edges)
        {
            int u=edge[0];
            int v=edge[1];
            int[] visited=new int[edges.length+1];
            if(iscycle(u,v,visited,adj))
            return edge;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        return new int[0];
    }
}
