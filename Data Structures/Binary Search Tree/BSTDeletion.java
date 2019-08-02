/*
	BINARY TREE DELETION OPERATION
	Case 1 : Node to be deleted is LEAF Node
	Case 2 : Node to be deleted has one child
	Case 3 : Node to be deleted has 2 children
*/

public class BSTDeletion {
	private Node root;
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
	public Node findNode(int data) {
		Node current = root;
		boolean condition = true;
		if(root.data == data) {
			return root;
		}
		else {
			while(condition == true) {
				if(current.data < data) {
					current = current.right;
				}
				else if(current.data > data){
					current = current.left;
				}
				else if(current.data == data) {
					condition = false;
					return current;
				}
				else {
					Node ret = null;
					System.out.println("Data not found in tree.");
					condition = false;
					return ret;
				}
			}
		}
		return current;
	}
	public Node findParent(int data) {
		Node current = root;
		Node parent = null;
		boolean condition = true;
		if(root.data == data) {
			// root does not have parent

		}
		else {
			while(condition = true) {
				if(current.data < data) {
					parent = current;
					current = current.right;
				}
				else if(current.data > data) {
					parent = current;
					current = current.left;
				}
				else if(current.data == data) {
					condition = false;
					return parent;
				}
				else  {
					// No parent like root
				}
			}
			
		}
		return parent;
	}
	public Node findInorderSuccessorNode(Node node) {
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	public Node delete(int data) {
		if(root == null) {
			System.out.println("Empty Tree!!");
			return root;
		}
		else {
			Node delNode = findNode(data);
			System.out.println("\ndata to be deleted "+delNode.data);
			Node myParent = findParent(data);
			System.out.println("\nparent data :"+myParent.data);
			// Case 1 : Leaf Node
			if(delNode.left == null && delNode.right == null) {
				if(myParent.left.data == delNode.data) {
					myParent.left = null;
				}
				else {
					myParent.right = null;
				}
			}
			// Case 2 : data to be deleted has 1 child node i.e parent with one child is to be delete
			else if((delNode.left == null && delNode.right != null) || (delNode.right == null && delNode.left != null)) {
				//Node parent = findNode(myParent.data);
				//System.out.println("Parent of Parent data "+parent.data);
				if(delNode.left == null && delNode.right != null) {
					myParent.right = delNode.right;
				}
				else {
					myParent.left = delNode.left;
				}
			}
			// Case 3 : Node to be deleted has all two children
			// finding the inOrder Successor of the node to be deleted
			// i.e. Minimum value on right subtree 
			else {
				// Parent of the node to be deleted will point to the inOrder successor node
				// inOrder successor node will point to the children of deleted node
				Node inOrderSuccessor = findInorderSuccessorNode(delNode);
				System.out.println("\n inOrderSuccessor value : "+inOrderSuccessor.data);
				myParent.right = inOrderSuccessor;
				inOrderSuccessor.right = delNode.right;
			}
		}
		
		return root;
	}
	public static void main(String[] args) {
		BSTDeletion bst = new BSTDeletion();

		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);

		bst.inOrder(bst.root);
		// Checking case 1
		Node ret = bst.delete(20);
		System.out.println();
		bst.inOrder(bst.root);
		// checking case 2
		bst.insert(90);
		System.out.println();
		bst.inOrder(bst.root);

		Node ret2 = bst.delete(80);
		System.out.println();
		bst.inOrder(bst.root);

		Node ret3 = bst.delete(70);
		System.out.println();
		bst.inOrder(bst.root);
	}
}