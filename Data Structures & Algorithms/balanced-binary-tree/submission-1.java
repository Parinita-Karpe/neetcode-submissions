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
    int diff=Integer.MIN_VALUE;
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        diff=Math.max(diff,Math.abs(left-right));
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        height(root);
        if(diff<=1)return true;
        return false;

    }
}
