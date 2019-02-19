import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BSTdeletion
{
	class Node
	{
		int data;
		Node left;
		Node right;

		public Node(int new_data)
		{
			data = new_data;
			left = null;
			right = null;
		}
	}
	// global variable root 
	Node root; 
	public BSTdeletion()
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
		System.out.println("\n INORDER");
		inorderRec(root);
	}
	public void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
	}
	void delete(int new_data)
	{
		root = deleteRec(root,new_data);
	}
	public void deleteRec(Node root,int new_data)
	{
		if(root == null)
		{
			System.out.println("\n Empty");
			return root;
		}
		if(new_data<root.data)
		{
			root.left = deleteRec(root.left,new_data);
		}
		else if(new_data>root.data)
		{
			root.right = deleteRec(root.right,new_data);
		}
		else
		{
			if(root.left == null)
			{
				// only one chld : right child
				return root.right; 
			}
			else if(root.right == null)
			{
				// only one child : left child
				return root.left;
			}

			// two child 
			root.data = minValue(root.right);
			root.right = deleteRec(root.right,root.data);
		}
		return root;
	}
	public int minValue(Node root)
	{
		int min = root.data;
		while(root.left!=null)
		{
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BSTdeletion tree = new BSTdeletion();

		tree.insert(10);
		
		tree.insert(20);
		tree.insert(30);
		tree.insert(5);
		tree.insert(1);

		tree.inorder();

		System.out.println("\n Enter the numebr to delete:");
		int number = sc.nextInt();

		tree.delete(number);
	
	}
}
/*
	
*/