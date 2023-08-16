package workSpace.src.searching;

public class MaximumDepthOfBT {
    TreeNode head;

    static class TreeNode {
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
            this.val = val;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }

    public void insert(int val){
        head = insertVal(head, val);
    }

    private TreeNode insertVal(TreeNode head, int val) {
        if(head == null) {
            return new TreeNode(val);
        }

        if(val < head.val) {
            head.leftNode = insertVal(head.leftNode, val);
        }else {
            head.rightNode = insertVal(head.rightNode, val);
        }
        return head;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.leftNode), maxDepth(root.rightNode)) + 1;
    }

    public static void main(String[] args) {
        MaximumDepthOfBT binaryTree = new MaximumDepthOfBT();
        int[] nums = {3, 9, 20, 15, 7};
        for(int i : nums){
            binaryTree.insert(i);
        }
        binaryTree.maxDepth(binaryTree.head);
    }

}
