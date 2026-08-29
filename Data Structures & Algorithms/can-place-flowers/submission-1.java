class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        while(i<flowerbed.length)
        {
            if(n==0)return true;
            if(flowerbed[i]==1)
            i+=2;
            else if(flowerbed.length==1 && i==0 && flowerbed[i]==0)
            {
                n--;
                i++;
            }
            else if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0)
            {
                n--;
                flowerbed[i]=1;
                i++;
            }
            else if(i==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0)
            {
                n--;
                flowerbed[i]=1;
                i++;
            }
            else if(i>0 && flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0)
            {n--;
            flowerbed[i]=1;
            i++;}
            else
            i++;
        }
        return n==0;
    }
}