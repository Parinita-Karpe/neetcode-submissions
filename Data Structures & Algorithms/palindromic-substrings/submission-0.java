class Solution {
    public int ispalindrome(String s,int left,int right)
    {
        int cnt=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {cnt++;
        left--;
        right++;}
        return cnt;
    }
    
    public int countSubstrings(String s) {
        int left=0,right=0;
        for(int i=0;i<s.length();i++)
        {
            left+=ispalindrome(s,i,i);
            right+=ispalindrome(s,i,i+1);
        }
        return left+right;
    }
}
