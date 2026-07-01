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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        
        que.add(root);

        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        while(que.size() > 0){

            int size = que.size();

            ArrayList<Integer> currElements = new ArrayList<>();

            while(size -- > 0){

                TreeNode currElement = que.poll();

                currElements.add(currElement.val);

                if(currElement.left != null) que.add(currElement.left);
                if(currElement.right != null) que.add(currElement.right);
            }

            res.add(currElements);
        }

        return res;
    }


}
