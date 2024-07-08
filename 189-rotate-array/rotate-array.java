class Solution {
    public void rotate(int[] nums, int k) {
        
        int mod=k%nums.length;

        int rotate_index=nums.length-mod;

        List<Integer> list=new ArrayList<Integer>();

        for(int i=rotate_index;i<nums.length;i++)
        {
           list.add(nums[i]);
        }

        for(int i=0;i<rotate_index;i++)
        {
            list.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=list.get(i);
        }
    }
}