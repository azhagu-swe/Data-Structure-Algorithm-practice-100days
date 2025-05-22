public class LinkedListCycleCheck {
    public static void main(String[] args) {
        // Create linked list nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // Uncomment the line below to introduce a cycle in the linked list
        // head.next.next.next.next.next = head.next.next;

        boolean hasCycle = detectCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }

    /**
     * Detects if a linked list has a cycle using Floyd's Cycle Detection Algorithm.
     *
     * @param head The head node of the linked list.
     * @return True if a cycle is detected, otherwise false.
     */
    private static boolean detectCycle(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;         // Move slow pointer by 1 step
            fastPointer = fastPointer.next.next;   // Move fast pointer by 2 steps

            if (slowPointer == fastPointer) {      // Cycle detected
                return true;
            }
        }

        return false; // No cycle found
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
