public class BSTSearch {
	private Node root;
	public boolean search(int data) {
		boolean ret = false;
			if(root == null) {
				System.out.println("Empty Tree!!");
				return false;
			}
			else {
				Node current = root;
				while(current != null) {
					if(current.data == data) {
						System.out.println("Data Found!!");
						ret = true;
						return ret;
					}
					else if(current.data < data) {
						current = current.right;
					}
					else {
						current = current.left;
					}
				}
				System.out.println("Data Not Found!!");
				ret = false;
			}
		return ret;
	}
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
	public static void main(String args[]) {
		BSTSearch bst = new BSTSearch();
		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);

		System.out.println(bst.search(33));
		System.out.println(bst.search(60));
	}
}