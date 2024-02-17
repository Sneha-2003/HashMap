class Solution {
    public List<List<Integer>> generate(int numRows) {
        

        List<List<Integer>> ans=new ArrayList<>();
        
        List<Integer> r1=new ArrayList<>();

        r1.add(1);
        ans.add(r1);
        if(numRows==1)
        return ans;

        List<Integer> r2=new ArrayList<>();
        r2.add(1);
        r2.add(1);
        ans.add(r2);
        if(numRows==2)
        return ans;

        for(int i=2;i<numRows;i++)
        {
            List<Integer> r=new ArrayList<>();
            r.add(1);
            for(int j=1;j<i;j++)
            {
                 int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                 r.add(val);
            }
            r.add(1);
            ans.add(r);
        }

        return ans;

    }
}