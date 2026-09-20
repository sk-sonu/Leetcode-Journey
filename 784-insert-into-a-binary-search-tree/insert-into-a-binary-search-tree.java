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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) root = new TreeNode(val) ;
        insert(root,val);
        return root;
    }
    public void insert(TreeNode node, int val)
    {
        if(node == null) node = new TreeNode(val);

        if(val<node.val && node.left == null) node.left = new TreeNode (val);
        if(val>node.val && node.right == null) node.right = new TreeNode (val);

        if(val<node.val) insert(node.left ,val);
        if(val>node.val) insert(node.right, val);

    }
}