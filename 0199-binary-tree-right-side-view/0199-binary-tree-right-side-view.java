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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<Integer> ();
        ArrayList<TreeNode> curr=new ArrayList<>();
        ArrayList<TreeNode> nextlevel=new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        curr.add(root);
        while(!curr.isEmpty()){
            ans.add(curr.get(curr.size()-1).val);
            
            for(TreeNode temp:curr){
                
                if(temp.left!=null){
                    nextlevel.add(temp.left);
                }
                if(temp.right!=null){
                    nextlevel.add(temp.right);
                }
                
            }
            
            curr=new ArrayList<>(nextlevel);
            nextlevel.clear();
        }

        return ans;
        
    }
}