class Solution {
    public String minWindow(String s, String t) {
        int left=0;
        if(s.length()<t.length())return "";
        int[] need=new int[128];
        for(char c:t.toCharArray())
        {
            need[c]++;
        }
        int right=0,count=t.length(),minlen=Integer.MAX_VALUE,start=0;
        while(right<s.length())
        {
            char c=s.charAt(right);
            if(need[c]>0)count--;
            need[c]--;
            right++;
            while(count==0)
            {
                if(right-left<minlen)
                {
                    minlen=right-left;
                    start=left;
                }
                char leftChar=s.charAt(left);
                need[leftChar]++;
                if (need[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
