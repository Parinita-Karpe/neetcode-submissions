class Solution {
    public boolean iscycle(int[] visited,List<List<Integer>> adj,int i)
    {
        visited[i]=1;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,-1});
        while(!q.isEmpty())
        {
            int[] cell=q.poll();
            int node=cell[0];
            int parent=cell[1];
            for(int j:adj.get(node))
            {
                if(visited[j]==0)
                {
                    visited[j]=1;
                    q.offer(new int[]{j,node});
                }
                else if(j!=parent)return true;
            }
            
        }
        return false;
    }
    public boolean validTree(int n, int[][] edges) {
        int[] visited=new int[n];
        if(edges.length!=n-1)return false;
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
        for(int i=0;i<n;i++)
        {
            if(visited[i]==0){
            if(iscycle(visited,adj,i))return false;}
        }
        return true;
    }
}
