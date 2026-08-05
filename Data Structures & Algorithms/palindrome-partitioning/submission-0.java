class Solution {
    public boolean ispalindrome(String s,int start,int end)
    {
        while(start<=end && end<s.length())
        {
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }
        return true;
    }
    public void helper(List<List<String>> res,List<String> ds,String s,int i)
    {
        if(i==s.length())
        {
            // ds.add(str.toString());
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(ispalindrome(s,i,j))
            {
                String temp=s.substring(i,j+1);
                ds.add(temp);
                helper(res,ds,s,j+1);
                ds.remove(ds.size()-1);
                
            }
        }


    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        // StringBuilder str=new StringBuilder();
        helper(res,new ArrayList<>(),s,0);
        return res;
    }
}
