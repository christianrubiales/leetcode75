package _11BinarySearchTree.easy;

/*
 * https://leetcode.com/problems/search-in-a-binary-search-tree
 * https://algo.monster/liteproblems/700
 */
public class SearchInABinarySearchTreeIterative {

    /*
     * O(log n) time best case for balanced tree, O(n) worst case if all children are in only one side
     * O(1) space
     */
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;

        while (temp != null && temp.val != val) {
            temp = temp.val > val ? temp.left : temp.right;
        }

        return temp;
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
