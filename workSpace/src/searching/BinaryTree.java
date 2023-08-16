package workSpace.src.searching;

public class BinaryTree {

	TreeNode head;
	static class TreeNode {
		int val;
		TreeNode leftNode;
		TreeNode rightNode;

		public TreeNode(int val){
			this.val = val;
			this.leftNode = null;
			this.rightNode = null;
		}
	}

	public void insert(int val){
		head = insertVal(head, val);
	}

	private TreeNode insertVal(TreeNode head, int val) {
		if(head == null){
			return new TreeNode(val);
		}

		if(val < head.val){
			head.leftNode = insertVal(head.leftNode, val);
		}else{
			head.rightNode = insertVal(head.rightNode, val);
		}

		return head;
	}

	public void inOrderTraversal(){
		System.out.print("Binary Tree (BST) : ");
		printInOrderTraversal(head);
		System.out.println();
	}

	private void printInOrderTraversal(TreeNode head) {
		if(head != null){
			printInOrderTraversal(head.leftNode);
			System.out.print(head.val+" ");
			printInOrderTraversal(head.rightNode);
		}
	}

	public boolean isPresent(int val){
		return searchValue(head, val);
	}

	private boolean searchValue(TreeNode head, int val) {
		if(head != null){

			if(val == head.val){
				return true;
			}

			if(val < head.val){
				return searchValue(head.leftNode, val);
			}else{
				return searchValue(head.rightNode, val);
			}
		}
		return false;
	}

	public void delete(int val){
		head = deleteValue(head, val);
	}

	private TreeNode deleteValue(TreeNode currNode, int val) {
		if(currNode == null){
			return null;
		}

		if (val < currNode.val) {
			currNode.leftNode = deleteValue(currNode.leftNode, val);
		} else if (val > currNode.val) {
			currNode.rightNode = deleteValue(currNode.rightNode, val);
		} else {
			// Node with the value to be deleted found

			// Case 1: Node with no children or only one child
			if (currNode.leftNode == null) {
				return currNode.rightNode;
			} else if (currNode.rightNode == null) {
				return currNode.leftNode;
			}

			// Case 2: Node with two children
			// Find the inorder successor (smallest value in the right subtree)
			currNode.val = findMinValue(currNode.rightNode);
			// Delete the inorder successor from the right subtree
			currNode.rightNode = deleteValue(currNode.rightNode, currNode.val);
		}
		return currNode;
	}

	private int findMinValue(TreeNode currNode) {
		while (currNode.leftNode != null) {
			currNode = currNode.leftNode;
		}
		return currNode.val;
	}


	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.insert(24);
		binaryTree.insert(20);
		binaryTree.insert(5);
		binaryTree.insert(2);
		binaryTree.insert(1);
		binaryTree.insert(0);
		binaryTree.insert(4);
		binaryTree.insert(3);
		binaryTree.insert(29);
		binaryTree.insert(22);
		binaryTree.insert(21);
		binaryTree.insert(23);
		binaryTree.insert(29);
		binaryTree.insert(27);
		binaryTree.insert(25);
		binaryTree.insert(28);
		binaryTree.insert(42);
		binaryTree.insert(10);
		binaryTree.insert(7);
		binaryTree.insert(6);
		binaryTree.insert(9);
		binaryTree.insert(12);
		binaryTree.insert(11);
		binaryTree.insert(15);
		

		binaryTree.inOrderTraversal();
		binaryTree.delete(5);
		System.out.println(binaryTree.isPresent(4));
	}

}
