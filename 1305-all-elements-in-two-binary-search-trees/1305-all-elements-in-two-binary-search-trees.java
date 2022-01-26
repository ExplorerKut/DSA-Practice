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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result=new ArrayList<Integer>();
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        
        getElementHelper(root1,list1);
        getElementHelper(root2,list2);
        int i=0,j=0;
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)>list2.get(j)){
                result.add(list2.get(j));
                j++;
            }
            else{
                result.add(list1.get(i));
                i++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i++));
        }
        while(j<list2.size()){
            result.add(list2.get(j++));
        }
        return result;
    }
    public void getElementHelper(TreeNode root, List<Integer> result){
        if(root!=null){
            getElementHelper(root.left,result);
            result.add(root.val);
            getElementHelper(root.right,result);
        }
    }
}