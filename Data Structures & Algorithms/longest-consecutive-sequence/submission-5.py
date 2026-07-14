class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        longest=0
        seq=0
        numset=set(nums)
        for num in nums:
            if num-1 not in numset:
                curr=num
                seq=1
                while curr+1 in numset:
                    curr+=1
                    seq+=1
                longest=max(longest,seq)
        return longest