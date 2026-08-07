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
    public void helper(TreeNode root,List<Integer> ds,int i)
    {
        if(root==null)return;
        if(i==ds.size()){
        ds.add(root.val);}

        helper(root.right,ds,i+1);
        helper(root.left,ds,i+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ds=new ArrayList<>();
        helper(root,ds,0);
        return ds;
    }
}
