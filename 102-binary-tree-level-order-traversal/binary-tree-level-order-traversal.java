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
    LinkedList<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            LinkedList<Integer> level = new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                level.add(current.val);
                if(current.left!=null) q.offer(current.left);
                if(current.right!=null) q.offer(current.right);
            }
            res.add(level);
        }
        return res;
    }
}