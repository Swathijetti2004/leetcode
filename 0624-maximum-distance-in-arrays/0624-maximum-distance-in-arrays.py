class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        g_max=arrays[0][-1]
        g_min=arrays[0][0]
        res=0
        for  arr in arrays[1:]:
            l_max,l_min=arr[-1],arr[0]
            res=max(res,max(g_max-l_min,l_max-g_min))
            g_max=max(g_max,l_max)
            g_min=min(g_min,l_min)
        return res