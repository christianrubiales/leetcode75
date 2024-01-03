package _11BinarySearchTree.easy;

/*
 * https://leetcode.com/problems/search-in-a-binary-search-tree
 * https://algo.monster/liteproblems/700
 */
public class SearchInABinarySearchTreeRecursive {

    /*
     * O(log n) time best case for a balanced tree, O(n) worst case if all the children are in only one side
     * O(log n) space best case for a balanced tree, O(n) worst case if all the children are in only one side
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
