class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        if(nums[i]>max)
        max=nums[i];
       int sum=0;
        for(int i=0;i<k;i++)
        sum=sum+max+i;

        return sum;
    }
}