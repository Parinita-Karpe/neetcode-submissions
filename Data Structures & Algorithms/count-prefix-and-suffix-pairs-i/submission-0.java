class Solution {
    public boolean isprefixandsuffix(String str1,String str2)
    {
        if(str1.length()>str2.length())return false;
        if(str1.equals(str2.substring(0,str1.length())) && str1.equals(str2.substring(str2.length()-str1.length(),str2.length())))
        return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isprefixandsuffix(words[i],words[j]))
                c++;
            }
        }
        return c;
    }
}