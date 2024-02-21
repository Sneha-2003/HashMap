class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();

        if(n==0 || n==1)
        return n;

        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0,len=0;

        while(right<n)
        {  char ch=s.charAt(right);
       
        if(map.containsKey(ch))
        left=Math.max(left,map.get(ch)+1);

            map.put(ch,right);
            len=Math.max(len,right-left+1);

            right++;
        }

        return len;
    }
}