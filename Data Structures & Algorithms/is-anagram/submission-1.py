class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        r1=sorted(s)
        r2=sorted(t)
        if r1==r2:
            return True
        return False