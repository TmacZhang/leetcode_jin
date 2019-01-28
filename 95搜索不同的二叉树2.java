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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return  new ArrayList<TreeNode>();
        }
        return generate(1 , n);
    }
    
    private  List<TreeNode> generate(int start, int end){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(start > end){
            res.add(null);
            return res;
        }
        
        for (int i = start ; i<= end; i++ ){
             List<TreeNode> lefts = generate(start , i-1);
             List<TreeNode> rights = generate(i+1 , end);
             for(TreeNode left :lefts){
                 for(TreeNode right : rights){
                     TreeNode treeNode = new TreeNode(i);
                     treeNode.left = left;
                     treeNode.right = right;
                     res.add(treeNode);
                 }
             }
        }
        return res;
        
    }
    
    
    
    
}