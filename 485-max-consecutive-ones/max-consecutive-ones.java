class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int c=0;

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==1)
            { 
               c++; 
            }
            else
            c=0;
             max=Math.max(max,c);

        }
        return max;

    }
}