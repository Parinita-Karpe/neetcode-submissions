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
    public boolean helper(TreeNode root,int sum)
    {
        if(root==null)return false; 
        sum-=root.val;
        if(root.left==null && root.right==null)return sum==0;
        return helper(root.left,sum)||helper(root.right,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum);
    }
}