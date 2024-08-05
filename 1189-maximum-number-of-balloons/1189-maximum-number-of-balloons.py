class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        
        s={}
        for char in text:
            if char not in s:
                s[char]=1
            else:
                s[char]+=1
        count=0
        while("b" in s.keys()):
            for char in "balloon":
                if char not in s.keys() or  s[char]==0:
                    break
                else:
                    s[char]-=1
                    if char=='n':
                        count+=1
                if s[char]==0:
                    s.pop(char)
        return count
                    
        