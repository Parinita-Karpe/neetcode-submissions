class MedianFinder {
    List<Integer> ans;
    public MedianFinder() {
        ans=new ArrayList<>();
    }
    
    public void addNum(int num) {
        ans.add(num);
        Collections.sort(ans);
        
    }
    
    public double findMedian() {
        if(ans.size()%2!=0)
        {
            int temp=ans.size()/2;
            
            return (double)ans.get(temp);
        }
        else
        {
            int n=ans.size()/2;
            double temp=(ans.get(n)+ans.get(n-1))/2.0;
            return temp;
        }
    }
}
