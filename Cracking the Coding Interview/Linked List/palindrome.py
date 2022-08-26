# Check a list for palindrome 
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None

def printList(llist):
    print("Inside PrintList function:")
    head = llist.head
    while head is not None:
        print(head.data)
        head = head.next
    print("\n-----------")

def append(llist, data):
    new_node = Node(data)
    if llist.head is None:
        llist.head = new_node
        return llist
    else:
        temp = llist.head
        while temp.next is not None:
            temp = temp.next
        temp.next = new_node
    return llist

# Writing a function to reverse a linked-list
def reverse(llist):
    prev = None
    current = llist.head
    while current is not None:
        next = current.next
        current.next = prev
        prev = current
        current = next
    llist.head = prev
    return llist
    
    
def checkPalindromeNaive(llist):
    print("Answer with Naive approach!!!")
    li = []
    p1 = llist.head
    while p1 is not None:
        li.append(p1.data)
        p1 = p1.next
    print("Printing li: ",li)
    lir = li[::-1]
    print("Printing li reverse: ", lir)
    if li == lir:
        return True
    else:
        return False
        
    
def checkPlaindrome2(llist):
    # in this function we will reverse and compare
    print("Inside checkPalindrome2: ")
    printList(llist)
    llistr = reverse(llist)
    printList(llistr)
    p1 = llist.head
    p2 = llistr.head
    boolean = False
    while p1 is not None:
        if p1.data == p2.data:
            boolean = True
        else:
            return False
        p1 = p1.next
        p2 = p2.next
    print("at the end of function the boolean is: ", boolean)
    return boolean

llist = LinkedList()
llist = append(llist, 7)
llist = append(llist, 1)
llist = append(llist, 6)
llist = append(llist, 1)
llist = append(llist, 5)
printList(llist)

# llist = reverse(llist)  # TO check the reverse function working
# printList(llist)

#print(checkPalindromeNaive(llist))
print(checkPlaindrome2(llist))