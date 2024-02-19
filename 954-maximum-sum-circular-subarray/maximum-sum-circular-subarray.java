class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int s = 0, s1 = 0, s2 = 0;
        for(int i : a) {
            s += i;
            
            s1 += i;
            if(s1 > max) max = s1;
            if(s1 < 0) s1 = 0;
            
            s2 += i;
            if(s2 < min) min = s2;
            if(s2 > 0) s2 = 0;
        }
        
        if(max < 0) return max;
        return Math.max(max,s-min);
    }
}