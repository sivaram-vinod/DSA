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
    public boolean isValidBST(TreeNode root) {
        List<Integer>InorderList=new LinkedList<>();

        helper(root,InorderList);

        boolean isBst=true;
        int prev=InorderList.get(0);

        for (int i = 1; i < InorderList.size(); i++) {
            if (InorderList.get(i)<=prev) {
                isBst=false;
                
            }
            prev=InorderList.get(i);
            
        }
        return isBst;
     
    }

    void helper(TreeNode treeNode,List<Integer>InorderList){
        if (treeNode==null) {
            return;
            
        }

        helper(treeNode.left, InorderList);
        InorderList.add(treeNode.val);
        helper(treeNode.right, InorderList);
        
    }
}