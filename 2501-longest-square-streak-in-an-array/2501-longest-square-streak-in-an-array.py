import math
class Solution:
    def longestSquareStreak(self, nums: List[int]) -> int:
        maxi=0
        nums_set=set(nums)
        # if len(nums)==2:
        #     if nums[0]*nums[0]==nums[1]:
        #         return 2
        for i in nums:
            val=i
            temp=0
            while(val*val in nums_set):
                temp+=1
                # temp.insert(len(temp),val*val)
                val=val*val
            if temp >=1:
                maxi=max(maxi,temp)

        return -1 if maxi == 0 else maxi+1