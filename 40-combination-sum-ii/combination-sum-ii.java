class Solution {

    public static void combination(int index,int[] candidates, int target,List<List<Integer>> res,List<Integer> ans)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ans));
            return ;
        }

        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1]) 
            continue;

            if(candidates[i]>target)
            break;

            ans.add(candidates[i]);
            combination(i+1,candidates,target-candidates[i],res,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> ans=new ArrayList<>();

        combination(0,candidates,target,res,ans);

        return res;
       
    }
}