class Solution {
        //moore voting algorithm
        
    public int majorityElement(int[] nums) {
     
         int c=0;
         int cap=nums[0];
         for(int i=0;i<nums.length;i++)
         {
                if(cap==nums[i])
                {
                   
                    c++;
                }
                else
                {
                    c--;
                }
                if(c==0)
                {
                    cap=nums[i];
                    c=1;
                }

         }

         return cap;
    }
}