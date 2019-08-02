public class BSTInsertionTraversal {
	public static Node root;

	// Time Complexity O(n)
	// n = height of Tree
	public void insert(int data) {
		Node node = new Node(data);
		if(root == null) {
			root = node;
			return;
		}
		boolean condition = true;
		Node current = root;
		Node parent = null;
		while(condition == true) {
			parent = current;
			if(parent.data < data) {
				current = current.right;
				if(current == null) {
					parent.right = node;
					condition = false;
				}
			}
			else {
				current = current.left;
				if(current == null) {
					parent.left = node;
					condition = false;
				}
			}
		}
	}
	public void inOrder(Node node) {
		if(node!=null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}
	public void preOrder(Node node) {
		if(node!=null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	public void postOrder(Node node) {
		if(node!=null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+" ");
		}
	}
	public static void main(String args[]) {
		BSTInsertionTraversal bst = new BSTInsertionTraversal();

		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);
		
		bst.inOrder(bst.root);
		System.out.println();
		bst.preOrder(bst.root);
		System.out.println();
		bst.postOrder(bst.root);
		System.out.println();


	}
}