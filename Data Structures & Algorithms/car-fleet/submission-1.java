class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(position[j+1]>position[j])
                {
                    int temp=position[j+1];
                    position[j+1]=position[j];
                    position[j]=temp;

                    int t2=speed[j+1];                    
                    speed[j+1]=speed[j];                    
                    speed[j]=t2;
                }
            }
        }
        int count=0;
        double[] time=new double[n];
        double maxtime=0;
        for(int i=0;i<n;i++)
        {
            time[i]=(double)(target-position[i])/speed[i];
        }
        for(int i=0;i<n;i++)
        {
            if(time[i]>maxtime)
            {
                maxtime=time[i];
                count++;
            }
        }
        return count;
    }
}
