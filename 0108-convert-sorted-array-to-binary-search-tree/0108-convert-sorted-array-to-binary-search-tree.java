/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums, 0, nums.length - 1);

    }

    static TreeNode helper(int[] nums, int l, int h) {
        if (l > h) {
            return null;
        }
        int mid = (l + h) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, l, mid - 1);
        root.right = helper(nums, mid + 1, h);
        return root;
    }
    // static void BST(TreeNode root,TreeNode node){
    // if (root==null){
    // root=node;
    // root.left=null;
    // root.right=null;
    // }
    // else if(root.val<node.val){
    // BST(root.right,node);
    // }
    // else if(root.val>node.val){
    // BST(root.left,node);
    // }
    // }
}