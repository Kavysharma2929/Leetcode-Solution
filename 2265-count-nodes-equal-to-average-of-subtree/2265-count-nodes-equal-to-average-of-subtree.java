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
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            Queue<TreeNode> temp=new LinkedList<>();
            temp.add(node);
            int sum=0;
            int count=0;
            while(!temp.isEmpty()){
                TreeNode curr=temp.poll();
                sum+=curr.val;
                count++;
                if(curr.left!=null) temp.add(curr.left);
                if(curr.right!=null) temp.add(curr.right);
            }
            if(sum/count==node.val) ans++;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        return ans;
    }
}