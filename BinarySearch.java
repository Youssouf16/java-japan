package question1;

class Node
{
    int data;
    Node next;
 
    // Constructor to create a new node
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class BinarySearch
{
    // function to insert a node at the beginning
    // of the Singly Linked List
    static Node push(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
 
    // Function to find middle element
    // using Fast and Slow pointers
    static Node middleNode(Node start, Node last)
    {
        if (start == null)
            return null;
 
        Node slow = start;
        Node fast = start.next;
 
        while (fast != last)
        {
            fast = fast.next;
            if (fast != last)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
 
    // function to insert a node at the beginning
    // of the Singly Linked List
    static Node binarySearch(Node head, int value)
    {
        Node start = head;
        Node last = null;
 
        do
        {
            // Find Middle
            Node mid = middleNode(start, last);
 
            // If middle is empty
            if (mid == null)
                return null;
 
            // If value is present at middle
            if (mid.data == value)
                return mid;
 
            // If value is less than mid
            else if (mid.data > value)
            {
                start = mid.next;
            }
 
            // If the value is more than mid.
            else
                last = mid;
        } while (last == null || last != start);
 
        // value not present
        return null;
    }
}