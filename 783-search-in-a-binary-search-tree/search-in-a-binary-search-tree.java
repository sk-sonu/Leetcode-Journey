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
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
         search(root, val);
         return ans;
    }
    public void search(TreeNode node, int val)
    {
        if(node == null) return ;

        if(node.val == val) ans =  node;
        if(val<node.val) search(node.left,val);
        if(val>node.val) search(node.right, val);
      
       
    }
}