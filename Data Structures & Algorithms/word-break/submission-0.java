class Solution {
    public boolean helper(String s,Boolean[] dp,List<String> dict,int i)
    {
        if(i==s.length())return true;
        if(dp[i]!=null)return dp[i];
        for(int j=i+1;j<=s.length();j++)
        {
            String sub=s.substring(i,j);
            if(dict.contains(sub))
            {
                boolean take=helper(s,dp,dict,j);
                if(take)
                return dp[i]=true;
            }
        }
        return dp[i]=false;
        
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp=new Boolean[s.length()+1];
        
        int i=0;
        return helper(s,dp,wordDict,i);
    }
}
