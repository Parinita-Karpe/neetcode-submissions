class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int k=1;
        int max=piles[0];
        int min=piles[0];
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            max=piles[i];
            if(min>piles[i])
            min=piles[i];
        }
        if(piles.length==h)
        {
            return max;
        }
        int left=1,right=max;
        while(left<right)
        {
            int mid=(left+right)/2;
            long hr=0;
            for(int pile:piles)
            {
                hr+=Math.ceil((double)pile/mid);
            }
            if(hr<=h)right=mid;
            else left=mid+1;
        }
        return left;
    }
}
