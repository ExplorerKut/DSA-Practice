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
        
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        inBST(root,val);
        return root;
    }
    public void inBST(TreeNode root, int val){
        if(root.val<val){
            if(root.right==null){
                TreeNode newNode=new TreeNode(val);
                root.right=newNode;
                return;
            }
            insertIntoBST(root.right,val);
        }
        else if(root.val>val){
            if(root.left==null){
                TreeNode newNode=new TreeNode(val);
                root.left=newNode;
                return;
            }
            insertIntoBST(root.left,val);
        }
    }
}