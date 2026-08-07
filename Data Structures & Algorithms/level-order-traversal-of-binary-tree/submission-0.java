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
    public void helper(TreeNode root,List<List<Integer>> res,int i)
    {
        if(root==null)return;
        if(i==res.size())res.add(new ArrayList<>());
        res.get(i).add(root.val);
        helper(root.left,res,i+1);
        helper(root.right,res,i+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        // if(root==null)return null;
        List<List<Integer>> res=new ArrayList<>();
        helper(root,res,0);
        return res;
    }
}
