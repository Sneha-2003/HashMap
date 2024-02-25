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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zig=new ArrayList<>();

        if(root==null)
        return zig;

        Queue<TreeNode> q=new LinkedList<>();
         q.add(root);
         int c=0;
        while(!q.isEmpty())
        { int len=q.size();
              List<Integer> l=new ArrayList<>();
            for(int i=0;i<len;i++)
            {  
                if(q.peek().left!=null)
                q.add(q.peek().left);

                if(q.peek().right!=null)
                q.add(q.peek().right);
             l.add(q.peek().val);
             q.remove();

            }
            if(c%2!=0)
            Collections.reverse(l);
zig.add(l);
            c++;
        }

        return zig;
    }
}