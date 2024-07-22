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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level=new ArrayList<>();
        if(root==null){
            return level;
        }
	    Queue<TreeNode> q=new LinkedList<>();
	    q.offer(root);
	    while(!q.isEmpty()){
	        int size=q.size();
            List<Integer> current=new ArrayList<>();
	        for(int i=0;i<size;i++){
	            TreeNode temp=q.poll();
                current.add(temp.val);
	            if(temp.left!=null){
	                q.offer(temp.left);
	            }
	            if(temp.right!=null){
	                q.offer(temp.right);
	            }
	            
	        }
            level.add(current);
	    }
	    return level;
    }
}