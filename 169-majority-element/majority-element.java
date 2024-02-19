class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
           if(c==0)
           maj=nums[i];

           if(maj==nums[i])
           c++;
           else
           c--;
        }

        return maj;


    }
}