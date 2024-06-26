class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int l[]=new int[nums.length];

        int r[]=new int[nums.length];

         l[0]=1;
         r[nums.length-1]=1;
         int n=nums.length;
        for(int i=1;i<n;i++)
        {
            l[i]=l[i-1]*nums[i-1];
        }

        for(int i=n-2;i>=0;i--)
        {
            r[i]=r[i+1]*nums[i+1];
        }
       int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
             res[i]=l[i]*r[i];
        }

        return res;
    }
}