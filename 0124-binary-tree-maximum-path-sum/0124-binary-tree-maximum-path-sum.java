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
    public  int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root);
            
            return res;
    }
    public  int helper(TreeNode root){
        if (root==null){
            return 0;
        }
        int lsum=Math.max(helper(root.left),0);
        int rsum=Math.max(helper(root.right),0);
        
        int self=lsum+rsum+root.val;
        res=Math.max(self,res);
        return Math.max(lsum,rsum)+root.val;
    }
}