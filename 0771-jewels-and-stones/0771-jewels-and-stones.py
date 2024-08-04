class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        j=list(jewels)
        count=0
        for i in stones:
            if i in j:
                count+=1
        return count