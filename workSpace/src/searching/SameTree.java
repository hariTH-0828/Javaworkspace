package workSpace.src.searching;

public class SameTree {

    TreeNode head;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void insert(int val) {
        head = insertVal(head, val);
    }

    private TreeNode insertVal(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.left == null) {
            root.left = new TreeNode(val);
        } else if (root.right == null) {
            root.right = new TreeNode(val);
        } else {
            insertVal(root.left, val);
        }

        return root;
    }

    public static void main(String[] args) {
        SameTree binaryTree = new SameTree();
        int[] p = {1, 2, 3};
        int[] q = {1, 2, 3};
        SameTree binaryTreeP = new SameTree();
        SameTree binaryTreeQ = new SameTree();

        for(int i : p) {
            binaryTreeP.insert(i);
        }

        for(int i : q) {
            binaryTreeQ.insert(i);
        }
    }
}
