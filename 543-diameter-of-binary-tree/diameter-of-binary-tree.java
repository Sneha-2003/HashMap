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
    public static int max_len=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        int max_len[]=new int[1];
        height(root,max_len);
        return max_len[0];

        
    }

    public int  height(TreeNode root,int[] max_len)
    {
             if(root==null)return 0;

             int lh=height(root.left,max_len);
             int rh=height(root.right,max_len);

             max_len[0]=Math.max(lh+rh,max_len[0]);

             return 1+Math.max(lh,rh);
    }
}