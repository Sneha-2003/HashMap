class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int l=0,r=0,len=0,n=nums.length;

        while(r<n)
        {
            if(nums[r]==0)
            zero+=1;
            while(zero>k)
            {
                if(nums[l]==0)
                zero--;

                l++;
            }
            len=Math.max(r-l+1,len);
            r++;
        }

        return len;
    }
}