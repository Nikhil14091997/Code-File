# removing the duplicates from the linked list - unsorted 
'''
kth to last element in a linkedlist 
'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None
    def printList(self):
        temp = self.head
        while(temp != None):
            print(temp.data, end=" ")
            temp = temp.next
        print()
   
    def removeKth(self, k):
        # we will use a runner node
        node = self.head 
        runner = self.head
        
        if k == 0:
            return None
        for i in range(k):
            if runner is None:
                return None # out of bounds
            else:
                runner = runner.next
        while runner is not None:
            node = node.next
            runner = runner.next
        return node.data
        
        


list = LinkedList()
list.head = Node(10)
list.head.next = Node(12)
list.head.next.next = Node(11)
list.head.next.next.next = Node(11)
list.head.next.next.next.next = Node(12)
list.head.next.next.next.next.next = Node(11)
list.head.next.next.next.next.next.next = Node(10)

list.printList()

print(list.removeKth(0))
        