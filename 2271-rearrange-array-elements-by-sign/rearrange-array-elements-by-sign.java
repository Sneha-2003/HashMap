class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
         List<Integer> neg=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            pos.add(nums[i]);
            else
            neg.add(nums[i]);
        }

        int k=0;

        for(int i=0;i<pos.size();i++)
        {
            nums[k++]=pos.get(i);
            nums[k++]=neg.get(i);
        }

        return nums;
    }
}