class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0;
        Arrays.sort(people);
        int left=0,right=people.length-1;
        while(right>=0 && left<=right && left<people.length)
        {
            if(left==right)
            {
                boat++;
                break;
            }
            if(people[left]+people[right]<=limit)
            {
                boat++;
                left++;
                right--;
            }
            else if(people[right]<=limit)
            {
                boat++;
                right--;
            }
            
        }
        return boat;
    }
}