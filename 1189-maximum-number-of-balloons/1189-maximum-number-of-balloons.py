class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        char_count = {
            'b': 0,
            'a': 0,
            'l': 0,
            'o': 0,
            'n': 0
        }
        for char in text:
            if char in char_count:
                char_count[char] += 1
        
        # Calculate the number of "balloon" words we can form
        char_count['l'] //= 2  # 'l' appears twice in "balloon"
        char_count['o'] //= 2  # 'o' appears twice in "balloon"

        # Find the limiting character, i.e., the character with the minimum count
        return min(char_count.values())
        # s={}
        # for char in text:
        #     if char not in s:
        #         s[char]=1
        #     else:
        #         s[char]+=1
        # count=0
        # while("b" in s.keys()):
        #     for char in "balloon":
        #         if char not in s.keys() or  s[char]==0:
        #             break
        #         else:
        #             s[char]-=1
        #             if char=='n':
        #                 count+=1
        #         if s[char]==0:
        #             s.pop(char)
        # return count
                    
        