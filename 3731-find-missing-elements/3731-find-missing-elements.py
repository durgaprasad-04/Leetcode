class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        a=min(nums)
        b=max(nums)
        ans=[]
        for i in range(a,b+1):
            if i in nums:
                pass
            else:
                ans.append(i)

        ans.sort()
        return ans