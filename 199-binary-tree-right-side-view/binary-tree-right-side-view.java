/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root==null)
        return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
     ans.add(root.val);
        while(!q.isEmpty())
        {    //List<Integer> end=new ArrayList<Integer>();
        int v=-1;
        int l=q.size();
            for(int i=0;i<l;i++)
            {
                if(q.peek().left!=null)
                {
                    q.add(q.peek().left);
                    //end.add(q.peek().left.val);
                    v=q.peek().left.val;
                    
                }
                if(q.peek().right!=null)
                {
                    q.add(q.peek().right);
                   // end.add(q.peek().right.val);
                   v=q.peek().right.val;
                }

                q.remove();
            }
            // if(end.size()!=0)
            // {
            // int l=end.size()-1;
            // ans.add(end.get(l));
            // }
            if(v!=-1)
            ans.add(v);
        }

        return ans;


    }
}