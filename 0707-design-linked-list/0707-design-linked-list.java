class MyLinkedList {
    // Inner Node class
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;

    // Initializes the MyLinkedList object
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Get the value of the index-th node. If the index is invalid, return -1.
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }
    
    // Add a node of value val before the first element of the linked list.
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++; // Always remember to increment size
    }
    
    // Append a node of value val as the last element of the linked list.
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        size++;
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    // Add a node of value val before the index-th node in the linked list.
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node curr = head;
        // Move to the node right before the target index
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    // Delete the index-th node in the linked list, if the index is valid.
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */