class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longest=0
        c=0
        i=0
        l_str=[]
        while i<len(s):
            if s[i] not in l_str:
                l_str.append(s[i])
                c+=1
                longest=max(longest,c)
                i+=1
            else:
                l_str.pop(0)
                c-=1
            
        return longest