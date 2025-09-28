public class MergeTwoSorted {

    // Node class
    public static class Node {
        int data;
        Node next;
    }

    // Custom LinkedList class
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // Add element at last
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

        // Display linked list
        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    // Merge two sorted linked lists
    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        Node one = l1.head;
        Node two = l2.head;
        LinkedList res = new LinkedList();

        while (one != null && two != null) {
            if (one.data < two.data) {
                res.addLast(one.data);
                one = one.next;
            } else {
                res.addLast(two.data);
                two = two.next;
            }
        }

        while (one != null) {
            res.addLast(one.data);
            one = one.next;
        }

        while (two != null) {
            res.addLast(two.data);
            two = two.next;
        }

        return res;
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);

        LinkedList list2 = new LinkedList();
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);

        LinkedList merged = merge(list1, list2);

        merged.display();  // Output: 1 2 3 4 5 6
    }
}
