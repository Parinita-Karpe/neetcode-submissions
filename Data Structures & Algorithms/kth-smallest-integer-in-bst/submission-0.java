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
    public void helper(TreeNode root,List<Integer> ds)
    {
        if(root==null)
        {return;}
        // if(root.left==null)
        // ds.add(root.val);
        helper(root.left,ds);
        helper(root.right,ds);
        ds.add(root.val);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        List<Integer> ds=new ArrayList<>();
        helper(root,ds);
        int[] arr=new int[ds.size()];
        for(int i=0;i<ds.size();i++)
        arr[i]=ds.get(i);
        Arrays.sort(arr);
        int ans=arr[k-1];
        return ans;

    }
}
