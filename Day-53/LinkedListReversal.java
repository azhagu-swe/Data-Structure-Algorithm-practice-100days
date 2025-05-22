public class LinkedListReversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Iterative Reversal
        System.out.println("Reversed Linked List (Iterative):");
        head = reverseLinkedListIteratively(head);
        printLinkedList(head);

        // Recursive Reversal
        System.out.println("Reversed Linked List (Recursive):");
        head = reverseLinkedListRecursively(head);
        printLinkedList(head);
    }

    /**
     * Reverse the linked list using recursion.
     *
     * @param head The head node of the linked list.
     * @return The new head node after reversal.
     */
    private static Node reverseLinkedListRecursively(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node reversedHead = reverseLinkedListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return reversedHead;
    }

    /**
     * Reverse the linked list using an iterative approach.
     *
     * @param head The head node of the linked list.
     * @return The new head node after reversal.
     */
    private static Node reverseLinkedListIteratively(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; // Temporarily store the next node
            current.next = previous; // Reverse the pointer
            previous = current; // Move 'previous' one step forward
            current = nextNode; // Move 'current' one step forward
        }

        return previous; // New head of the reversed list
    }

    /**
     * Print the linked list.
     *
     * @param head The head node of the linked list.
     */
    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

/**
 * Represents a node in a singly linked list.
 */
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
