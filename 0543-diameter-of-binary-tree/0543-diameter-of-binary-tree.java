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
    public  int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
       return diameter;
    }
    int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        // else if(node.left==null && node.right==null){
        //     return 1;
        // }
        int leftDia=helper(node.left);
        int righDia=helper(node.right);
        
        this.diameter=Math.max(diameter,leftDia+righDia);
        
        
        return Math.max(leftDia,righDia)+1;
    }
}
// public class Solution {
//     int max = 0;
    
//     public int diameterOfBinaryTree(TreeNode root) {
//         maxDepth(root);
//         return max;
//     }
    
//     private int maxDepth(TreeNode root) {
//         if (root == null) return 0;
        
//         int left = maxDepth(root.left);
//         int right = maxDepth(root.right);
        
//         max = Math.max(max, left + right);
        
//         return Math.max(left, right) + 1;
//     }
// }