import java.util.*;
import java.io.*;
public class linkedlistins
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    public void insertStart(int val)
    {
        Node new_node = new Node(val);
        new_node.next = null;
        new_node.next = head;
        head = new_node;
    }
    public void insertEnd(int val)
    {
        Node new_node = new Node(val);
        new_node.next = null;
        //new_node.data = val;
        Node ptr = head;
        while(ptr.next!=null)
        {
            ptr = ptr.next;
        }
        ptr.next = new_node;
        new_node.next = null;
    }
   public void insertAfter(int val, int after)
    {
        Node new_node = new Node(val);
        Node ptr = head;
        
        while(ptr.data!=after)
        {
            ptr = ptr.next;
        }
        
        new_node.next = ptr.next;
        ptr.next = new_node;
    }
    public void show()
    {
        Node ptr = head;
        System.out.println("the link list is");
        while(ptr.next!=null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.print(ptr.data + " ");
         System.out.println();
    }
    public static void main(String args[])
    {
        linkedlistins obj = new linkedlistins();
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be inserted at the beginning");
        num = sc.nextInt();
        obj.insertStart(num);
        
        
        obj.show();
        System.out.println("enter number for the end");
        num = sc.nextInt();
        obj.insertEnd(num);
        obj.show();
        System.out.println("enter the number to be inserted");
        num = sc.nextInt();
        int n;
        System.out.println("enter the number after which to be inserted");
        n = sc.nextInt();
        obj.insertAfter(num,n);
        obj.show();
    }
}