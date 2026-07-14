class Solution:
    def isValid(self, s: str) -> bool:
        result=[]
        i=0
        while i<len(s):
            if s[i]=='(' or s[i]=='[' or s[i]=='{':
                result.append(s[i])
            elif s[i]=='}':
                if not result or result[-1]!='{' :
                    return False
                result.pop()
            elif s[i]==']':
                if not result or result[-1]!='[':
                    return False
                result.pop()
            elif s[i]==')':
                if not result or result[-1]!='(' :
                    return False
                result.pop()
            i+=1
        if len(result)==0:
            return True
        return False