class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)
        return 1;
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1]=nums[j];
                i++;
            }
            //nums[i+1]
        }
        return i+1;
    }
}