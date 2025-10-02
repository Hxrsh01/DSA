public class GetValues {
    class Node {
        int data;
        Node next;
    }

    class LinkedList {
        Node head;
        Node tail;
        int size;

        // Get first element
        void getFirst() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                System.out.println("First: " + head.data);
            }
        }

        // Get last element
        void getLast() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                System.out.println("Last: " + tail.data);
            }
        }

        // Get element at a specific index
        void getAtIdx(int idx) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            System.out.println("At index " + idx + ": " + temp.data);
        }

        // Display the entire linked list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Helper method to add nodes at last
        void addLast(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        GetValues gv = new GetValues();
        LinkedList list = gv.new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();       // 10 -> 20 -> 30 -> 40 -> null
        list.getFirst();      // First: 10
        list.getLast();       // Last: 40
        list.getAtIdx(2);     // At index 2: 30
    }
}
