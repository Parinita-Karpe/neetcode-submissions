class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            c++;
        }
        String res="";
        
        int i=1;
        while(i<s.length())
        {
            if(c>1){
            res='1'+res;
            c--;}
            else
            {
                res=res+'0';
            }
            i++;
        }
        if(c==1)
        res=res+'1';
        return res;

    }
}