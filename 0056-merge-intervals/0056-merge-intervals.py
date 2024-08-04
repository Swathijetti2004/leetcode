class Solution(object):
    def merge(self, arr):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]"""
        n=len(arr)
        if(n<=1):
            return arr
        ans=[]
        arr.sort(key=lambda x: x[0])
        for interval in arr:
            if not ans or ans[-1][1]<interval[0]:
                ans.append(interval)
            else:
                ans[-1][1]=max(ans[-1][1],interval[1])
            
        return ans
        