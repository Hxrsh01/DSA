public class AddFirst {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List fields
    private Node head;
    private int size;

    // Constructor
    public AddFirst() {
        head = null;
        size = 0;
    }

    // Add a new node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // point new node to current head
        head = newNode;      // update head to new node
        size++;
    }

    // Display linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get size of the list
    public int getSize() {
        return size;
    }

    // Test the AddFirst class
    public static void main(String[] args) {
        AddFirst list = new AddFirst();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        list.display(); // Output: 30 -> 20 -> 10 -> null
        System.out.println("Size: " + list.getSize()); // Output: Size: 3
    }
}
