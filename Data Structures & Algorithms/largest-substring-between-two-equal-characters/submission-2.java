class Solution {

    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=-1;
        int temp1=0;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {temp1=map.get(s.charAt(i));
            max=Math.max(max, i-temp1-1);
            }
            else
            map.put(s.charAt(i),i);

        }
        return max;
    }
}