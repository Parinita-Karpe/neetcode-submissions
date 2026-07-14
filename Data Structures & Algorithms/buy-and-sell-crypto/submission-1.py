class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy=99999
        max_p=0
        for i in prices:
            if buy>i:
                buy=i
            else:
                max_p=max(max_p,i-buy)
        return max_p