class Solution:
    def isPalindrome(self, s: str) -> bool:
        alphanum=''.join(ch for ch in s if ch.isalnum())
        alphanum=alphanum.lower()
        for ch in range(int((len(alphanum))/2)):
            if alphanum[ch]!=alphanum[-1-ch]:
                return False
        return True