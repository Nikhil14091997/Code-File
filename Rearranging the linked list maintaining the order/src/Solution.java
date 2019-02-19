import java.util.*;
import java.io.*;
import java.lang.*;
public class Solution {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		public Node(int new_data) {
			data = new_data;
			next = null;
		}
	}
	public Solution() {
		head = null;
		tail = null;
	}
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
            head = new_node;
        }
		else {
            tail.next = new_node;
        }

        tail = new_node;
	}
	public void show(Node head) {
		System.out.println("Printing LinkedList!!");
		
		Node ptr = head;
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	public static Node rearrange(Node head,int x) {
		Node smallerHead = null;
		Node smallerLast = null;
		Node equalHead = null;
		Node equalLast = null;
		Node greaterHead = null;
		Node greaterLast = null;
		// comparing all the data and storing them
		while(head!=null) {
			if(head.data == x) {
				if(equalHead == null) {
					equalHead = equalLast = head;
				}
				else {
					equalLast.next = head;
					equalLast = equalLast.next;
				}
			}
			else if(head.data < x) {
				if(smallerHead == null) {
					smallerHead = smallerLast = head;
				}
				else {
					smallerLast.next = head;
					smallerLast = head;
				}
			}
			else {
				if(greaterHead == null) {
					greaterHead = greaterLast = head;
				}
				else {
					greaterLast.next = head;
					greaterLast = head;
				}
			}
			head = head.next;
		}
		
		if(greaterLast.next != null) {
			greaterLast.next = null;
		}
		if (smallerHead == null) { 
	        if (equalHead == null) 
	            return greaterHead; 
	        equalLast.next = greaterHead; 
	        return equalHead; 
	    } 
		if (equalHead == null) 
	    { 
	        smallerLast.next = greaterHead; 
	        return smallerHead; 
	    } 
		smallerLast.next = equalHead; 
	    equalLast.next = greaterHead; 
	    return  smallerHead;
	    
	}
	public static void main(String args[]) {
		Solution list = new Solution();
		list.insert(1);
		list.insert(4);
		list.insert(2);
		list.insert(5);
		list.insert(3);
		
		list.show(list.head);
		list.head = list.rearrange(list.head, 4);
		list.show(list.head);
		
		
	}
}
