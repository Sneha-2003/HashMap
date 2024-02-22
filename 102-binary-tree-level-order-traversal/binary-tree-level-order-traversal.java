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
        List<List<Integer>> lot=new ArrayList<>();
        if(root==null)
        return lot;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int len=q.size();
           List<Integer> subl=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                     subl.add(q.peek().val);
                          
                    if(q.peek().left!=null)
                    q.add(q.peek().left);
                    if(q.peek().right!=null)
                    q.add(q.peek().right);

                     q.remove();
            }
            lot.add(subl);
        }

        return lot;
    }
}