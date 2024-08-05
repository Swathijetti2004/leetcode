class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        
        mag={}
        for char in magazine:
            if char not in mag.keys():
                mag[char]=1
            else:
                mag[char]+=1
        for char in ransomNote:
            if char not in mag.keys():
                return False
            else:
                mag[char]-=1
            if(mag[char]<0):
                return False
        return True
        
        
        