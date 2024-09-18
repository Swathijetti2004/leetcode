class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d={}
        n=len(nums)
        for val in nums:
            if(val in d.keys()):
                d[val]+=1
            else:
                d[val]=1
        ans=-1
        for key,val in d.items():
            if(val>(n/2)):
                ans=key
                
        return ans