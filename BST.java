import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
// Binary Search Tree 
/*
	1. Insertion
	2. Searching
	3. Traversing
*/
public class BST
{
	class Node
	{
		int data;
		Node left;
		Node right;

		public Node(int new_data)
		{
			data = new_data;
			left = right = null;
		}
	}
	Node root;
	public BST()
	{
		root = null;
	}
	public void insert(int new_data)
	{
		root = insertRec(root,new_data);
	}
	Node insertRec(Node root,int new_data)
	{
		if(root == null)
		{
			Node node = new Node(new_data);
			return node;
		}
		if(new_data<root.data)
		{
			root.left = insertRec(root.left,new_data);
		}
		else if(new_data>root.data)
		{
			root.right = insertRec(root.right,new_data);
		}

		return root;
	}
	void inorder()
	{
		System.out.println("\n IN-ORDER");
		inorderRec(root);
	}
	void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}
	void preorder()
	{
		System.out.println("\n PRE-ORDER");
		preorderRec(root);
	}
	void preorderRec(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	void postorder()
	{
		System.out.println("\n POST-ORDER");
		postorderRec(root);
	}
	void postorderRec(Node root)
	{
		if(root!=null)
		{
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.println(root.data);
		}
	}
	public boolean searchRecursively(Node root,int number);
	{
		if(root == null)
		{
			return false;
		}
		if(root.data == number)
		{
			return true;
		}
		if(number<root.data)
		{
			return searchRecursively(root.left,number);
		}
		else if(number>root.data)
		{
			return searchRecursively(root.right,number);
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BST tree = new BST();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(5);
		tree.insert(1);

		

		tree.inorder();
		tree.preorder();
		tree.postorder();

		System.out.println("\n Enter a number to search");
		int number = sc.nextInt();
		//System.out.print(tree.root.data);
		System.out.println(tree.searchRecursively(tree.root,number));
	}
} 