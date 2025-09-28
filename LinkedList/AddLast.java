public class AddLast {
    // Node class
    public static class Node {
        int data;
        Node next;
    }

    // LinkedList class
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // Method to add element at last
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {  // empty list
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // Display method
        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.display();  // Output: 10 20 30
    }
}
