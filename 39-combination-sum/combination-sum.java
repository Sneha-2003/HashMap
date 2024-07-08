class Solution {
    public static void combination(int index,int[] candidates, int target,List<List<Integer>> res,List<Integer> ans)
    {   if(index==candidates.length)
        {
        if(target==0)
        {
            res.add(new ArrayList<>(ans));
        }
           return ;
        }

        if(candidates[index]<=target)
        {       ans.add(candidates[index]);
                 combination(index,candidates,target-candidates[index],res,ans);
                 ans.remove(ans.size()-1);
        }

        combination(index+1,candidates,target,res,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> ans=new ArrayList<>();

        combination(0,candidates,target,res,ans);
        return res;
    }
}