class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        while(original in nums):
            # i=nums.index(original)
            # nums[i]=
            original*=2
        return original
        