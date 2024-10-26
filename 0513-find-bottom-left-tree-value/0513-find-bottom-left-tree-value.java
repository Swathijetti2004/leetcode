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
    public int findBottomLeftValue(TreeNode root) {
        
       // ArrayList<Integer> ans=new ArrayList<Integer> ();
        ArrayList<TreeNode> curr=new ArrayList<>();
        ArrayList<TreeNode> nextlevel=new ArrayList<>();
        ArrayList<TreeNode> templist=new ArrayList<>();
        
        if(root==null){
            return -1;
        }
        curr.add(root);
        while(!curr.isEmpty()){
            //ans.add(curr.get(curr.size()-1).data);
            
            for(TreeNode temp:curr){
                if(temp.right!=null){
                    nextlevel.add(temp.right);
                }
                if(temp.left!=null){
                    nextlevel.add(temp.left);
                }
                
            }
            templist=new ArrayList<>(curr);
            curr=new ArrayList<>(nextlevel);
            nextlevel.clear();
        }

        return templist.remove(templist.size()-1).val;
    }
}