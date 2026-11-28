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

    public void isHelper(TreeNode root,List<Integer>li){
        if(root == null){
            return;
        }
        isHelper(root.left,li);
        li.add(root.val);
        isHelper(root.right,li);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer>li = new ArrayList<>();
      isHelper(root,li);  
      return li;
    }
}