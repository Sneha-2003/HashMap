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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
        return l;
    //     leveltrav(root,l);

    //     return l;
    // }

    // public void leveltrav(TreeNode root,List<List<Integer>> l)
    // {
         Queue<TreeNode> q=new LinkedList<TreeNode>();

        q.add(root);

        while(q.size()>0)
        {
            List<Integer> l1=new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.remove();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);

                l1.add(curr.val);


            }

            l.add(l1);
        }

        return l;

    }
}