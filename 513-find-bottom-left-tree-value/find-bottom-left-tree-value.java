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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
        return -1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int view=0;
        while(!q.isEmpty())
        {
            int len=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
               ans.add(q.peek().val);
               if(q.peek().left!=null)
               q.add(q.peek().left);
               if(q.peek().right!=null)
               q.add(q.peek().right);

               q.remove();
            }
            view=ans.get(0);
        }

        return view;
        
    }
}