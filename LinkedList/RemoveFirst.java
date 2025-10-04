public class RemoveFirst {
    // Node class for the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to remove the first node from the linked list
    public static Node removeFirst(Node head) {
        // Check if the list is empty
        if (head == null) {
            return null;
        }
        // Return the next node as the new head
        return head.next;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original list: ");
        printList(head);

        // Remove the first node
        head = removeFirst(head);

        System.out.print("After removing first: ");
        printList(head);
    }
}