public class LinkedListCycleDetection {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        // head.next.next.next = head;
        boolean isFoundCycle = hasCycle(head);
        System.out.println("Linked is has Cycle : " + isFoundCycle);

    }

    private static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

}

class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

}