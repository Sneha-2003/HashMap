class Solution {
    public int removeDuplicates(int[] nums) {
        
        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            map.put(nums[i],2);
            else
            map.put(nums[i],1);
        }
        int index=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            int itr=m.getValue();

            for(int i=0;i<itr;i++)
            {  
                //System.out.println(m.getKey());
                nums[index++]=m.getKey();
            }
        }
        //Arrays.sort(nums);
        return index;
    }
}