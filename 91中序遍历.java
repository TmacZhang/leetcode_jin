/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List list = new ArrayList();
        bianli(root, list);
        return list;
    }
    
    private void bianli( TreeNode root , List<Integer> list){
        if(root != null){
            bianli(root.left, list);
            list.add(root.val);
            bianli(root.right, list);
        }
    }
}