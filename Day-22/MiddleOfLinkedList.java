// public class MiddleOfLinkedList {
    
// }
/**
 * Definition for singly-linked list.
 * (This class is usually provided by LeetCode - same as previous problems)
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { // Basic constructor often used
        val = x;
        next = null;
    }
    // Added constructors for convenience if needed
    ListNode() {}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MiddleOfLinkedList {
    /**
     * Finds the middle node of a singly linked list using the Tortoise and Hare algorithm.
     * If there are two middle nodes, returns the second middle node.
     *
     * Analogy: Two runners, slow and fast. When the fast runner reaches the end,
     * the slow runner will be at the middle.
     *
     * @param head The head node of the linked list.
     * @return The middle node of the linked list.
     */
    public ListNode middleNode(ListNode head) {
        // Initialize both slow and fast pointers to the head of the list.
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list. The loop continues as long as the fast pointer
        // and the node right after it are not null.
        // This ensures 'fast' can safely advance two steps (fast.next.next).
        while (fast != null && fast.next != null) {
            // Move slow pointer one step.
            slow = slow.next;
            // Move fast pointer two steps.
            fast = fast.next.next;
        }

        // When the loop terminates:
        // 1. If the list has an odd number of nodes, 'fast' will be at the last node,
        //    and 'slow' will be exactly at the middle node.
        // 2. If the list has an even number of nodes, 'fast' will be null (it moved off the end),
        //    and 'slow' will be at the second middle node.
        // In both cases, 'slow' points to the desired node.
        return slow;
    }

    // Helper method to create a list for testing (optional)
    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

     // Helper method to print list from a given node (for testing)
    public static void printListFromNode(ListNode node) {
        if (node == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        ListNode current = node;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.println("]");
    }


    // Example Usage (optional, for testing)
    public static void main(String[] args) {
        MiddleOfLinkedList sol = new MiddleOfLinkedList();

        // Example 1: head = [1,2,3,4,5] -> Output: [3,4,5]
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        ListNode middle1 = sol.middleNode(head1);
        System.out.print("Example 1 Middle: ");
        printListFromNode(middle1); // Expected: [3,4,5]

        // Example 2: head = [1,2,3,4,5,6] -> Output: [4,5,6]
        ListNode head2 = createList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode middle2 = sol.middleNode(head2);
        System.out.print("Example 2 Middle: ");
        printListFromNode(middle2); // Expected: [4,5,6]

        // Example 3: head = [1] -> Output: [1]
        ListNode head3 = createList(new int[]{1});
        ListNode middle3 = sol.middleNode(head3);
        System.out.print("Example 3 Middle: ");
        printListFromNode(middle3); // Expected: [1]

         // Example 4: head = [1, 2] -> Output: [2]
        ListNode head4 = createList(new int[]{1, 2});
        ListNode middle4 = sol.middleNode(head4);
        System.out.print("Example 4 Middle: ");
        printListFromNode(middle4); // Expected: [2]
    }
}

