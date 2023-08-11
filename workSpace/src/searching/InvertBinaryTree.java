package workSpace.src.searching;
public class InvertBinaryTree {

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

    public TreeNode invertTree(TreeNode root) {
        if(root.leftNode != null || root.rightNode != null){
            TreeNode leftChild = root.leftNode;

            root.leftNode = root.rightNode;
            root.rightNode = leftChild;

            invertTree(root.leftNode);
            invertTree(root.rightNode);
        }
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree binaryTree = new InvertBinaryTree();
        int[] nums = {4,2,7,1,3,6,9};
        for(int i : nums){
            binaryTree.insert(i);
        }

        TreeNode head = binaryTree.invertTree(binaryTree.head);
    }
}
