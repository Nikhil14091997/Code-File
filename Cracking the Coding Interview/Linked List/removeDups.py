# removing the duplicates from the linked list - unsorted 
'''
3 pointers - prev current next 
using two loops 
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
    def removeDuplicates1(self):
        prev = None
        match = self.head 
        while match.next is not None:
            prev = match
            iter = match.next
            while iter.next is not None:
                if match.data == iter.data:
                    prev.next = iter.next
                    iter = iter.next
                else:
                    prev = prev.next
                    iter = iter.next
            match = match.next
    def removeDuplicates2(self):
        # Here we will try to use hashing 
        hash = set()
        current = self.head
        hash.add(current.data)
        while current.next is not None:
            if current.next.data in hash:
                current.next = current.next.next
            else:
                hash.add(current.next.data)
                current = current.next
        return hash
    
    def removeNoBuffer(self):
        current = self.head
        while current is not None:
            # We will remove all the future nodes with same value
            runner = current
            while runner.next is not None:
                if (runner.next.data == current.data):
                    runner.next = runner.next.next
                else:
                    runner = runner.next
            current = current.next
                
               


list = LinkedList()
list.head = Node(10)
list.head.next = Node(12)
list.head.next.next = Node(11)
list.head.next.next.next = Node(11)
list.head.next.next.next.next = Node(12)
list.head.next.next.next.next.next = Node(11)
list.head.next.next.next.next.next.next = Node(10)

list.printList()

list.removeNoBuffer()

list.printList()
            
        