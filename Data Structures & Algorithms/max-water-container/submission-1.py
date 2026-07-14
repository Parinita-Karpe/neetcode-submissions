class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxa=0
        for i in range(len(heights)):
            for j in range(len(heights)-1,-1,-1):
                area=(j-i)*min(heights[i],heights[j])
                maxa=max(maxa,area)
        return maxa
            