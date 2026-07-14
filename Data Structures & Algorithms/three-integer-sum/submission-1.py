class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        triplet=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        triplet.append([nums[i],nums[j],nums[k]])

        triplet=[sorted(s) for s in triplet]
        unique=[]
        triplet.sort()
        for i in triplet:
            if not unique or i!=unique[-1]:
                unique.append(i)
        return unique