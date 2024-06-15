public class queue2
{
    Node front;
    Node rear;
    private int currentsize;
    
    private class Node
    {
        int data;
        Node next;
    }
    public queue2() // constructor 
    {
        front = null;
        rear = null;
        currentsize = 0;
    }
    public boolean isEmpty()
    {
        return (currentsize == 0);
    }
    public void enqueue(int data)
    {
        Node node = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if(isEmpty())
        {
            front = rear;
        }
        else
        {
            node.next = rear;
        }
        currentsize++;
        
    }
    public void printQueue()
    {
        Node ptr;
        ptr = front;
        while(ptr!=rear)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.print(ptr.data);
        System.out.println();
    }
    public void dequeue()
    {
        if(isEmpty())
        {
            rear = null;
        }
        front = front.next;
        currentsize--;
    }
    public static void main(String args[])
    {
        queue2 q = new queue2();
        q.enqueue(10);
        q.enqueue(50);
        q.enqueue(40);
        q.enqueue(30);
        q.enqueue(20);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        
        
    }
}