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
    
def pad(llist, n):
    # number of zeros to be padded at the end
    node = llist.head
    while node.next is not None:
        node = node.next
    for i in range(n):
        temp = Node(0)
        node.next = temp
        node = node.next
    #printList(llist)
    return llist
    
    
# Sum of two linked list 
def length(llist):
    print("Inide Length function")
    count = 0
    node = llist.head
    if node is None:
        print("Empty Linked List!!")
    while node is not None:
        count += 1
        node = node.next
    print("\n Length of Linked List: ", count)
    return count

def sumList(llist1, llist2):
    # first we will add the padding to the end of shorter linkedlist 
    length1 = length(llist1)
    length2 = length(llist2)
    if length1 < length2:
        print("Length of list1 is smaller: ")
        llist1 = pad(llist1, length2-length1)
    elif length2 < length1:
        print("Length of list2 is smaller: ")
        llist2 = pad(llist2, length1- length2)
    # now both the list are of same length 
    node1 = llist1.head
    node2 = llist2.head
    retList = LinkedList()
    count = 0
    carry = 0
    while node1.next is not None:
        print("For digit position: ", count)
        print("the carry would be: ", carry)
        dig = node1.data + node2.data + carry
        print("initial sum: ", dig)
        if dig > 9:
            carry = int((dig - dig%10)/10)
            print("carry after sum:", carry)
            print("data to be appended: ", dig%10)
            retList = append(retList, dig%10)
        else:
            carry = 0
            print("data to be appended: ", int(dig%10))
            retList = append(retList, int(dig%10))
        node1 = node1.next
        node2 = node2.next
        count += 1
        print("\n")
    print("For digit position: ", count)
    print("the carry would be: ", carry)
    dig = node1.data + node2.data + carry
    retList = append(retList, dig)
    
    return retList

llist = LinkedList()
llist = append(llist, 7)
llist = append(llist, 1)
llist = append(llist, 6)
printList(llist)

llist2 = LinkedList()
llist2 = append(llist2, 5)
llist2 = append(llist2, 9)
llist2 = append(llist2, 5)

printList(llist2)

retList = sumList(llist, llist2)
printList(retList)