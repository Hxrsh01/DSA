class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSort {

    // Function to get the middle of the linked list
    private Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to merge two sorted linked lists
    private Node sortedMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;

        if (left.data <= right.data) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }

        return result;
    }

    // Main merge sort function
    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;  // split the list into two halves

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    // Utility function to print the list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        MergeSort list = new MergeSort();

        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(8);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(1);

        System.out.println("Original Linked List:");
        list.printList(head);

        head = list.mergeSort(head);

        System.out.println("Sorted Linked List:");
        list.printList(head);
    }
}
