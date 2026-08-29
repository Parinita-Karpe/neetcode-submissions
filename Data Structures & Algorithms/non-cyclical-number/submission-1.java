class Solution {
    public boolean isHappy(int n) {
        List<Integer> seen=new ArrayList<>();
        while(!seen.contains(n))
        {
            if(n==1)return true;
            seen.add(n);
            int temp=n;
            int sum=0;
            while(temp>0)
            {
                int r=temp%10;
                sum+=r*r;
                temp=temp/10;
            }
            n=sum;
            
        }
        return false;
    }
}
