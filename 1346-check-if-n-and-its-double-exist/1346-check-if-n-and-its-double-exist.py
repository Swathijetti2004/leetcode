class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        for i in range(len(arr)):
            if 2*arr[i] in arr and i!=arr.index(2*arr[i]):
                return True
        return False