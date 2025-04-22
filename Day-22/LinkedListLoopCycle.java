/**
 * Definition for singly-linked list.
 * (This class is usually provided by LeetCode - same as previous problems)
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    // Added constructors for convenience if needed, though not strictly necessary
    // for this problem's solution logic
    ListNode() {
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedListLoopCycle {
    /**
     * Determines if a linked list contains a cycle using Floyd's Tortoise and Hare
     * algorithm.
     *
     * Analogy: Two runners, one slow (Tortoise) and one fast (Hare), start on a
     * path.
     * If there's a loop, the Hare will eventually lap the Tortoise within the loop.
     * If there's no loop, the Hare reaches the end first.
     *
     * @param head The head node of the linked list.
     * @return true if the linked list has a cycle, false otherwise.
     */
    public boolean hasCycle(ListNode head) {
        // --- Edge Cases ---
        // If the list is empty or has only one node, it cannot have a cycle.
        if (head == null || head.next == null) {
            return false;
        }

        // --- Initialize Runners ---
        ListNode slow = head; // Tortoise starts at the beginning.
        ListNode fast = head; // Hare starts at the beginning.

        // --- The Race ---
        // We need to ensure 'fast' and 'fast.next' are not null before moving fast
        // pointer two steps.
        while (fast != null && fast.next != null) {
            // Move Tortoise one step.
            slow = slow.next;
            // Move Hare two steps.
            fast = fast.next.next;

            // --- Check for Collision ---
            // If the slow and fast pointers meet at the same node, a cycle is detected.
            if (slow == fast) {
                return true; // Cycle found!
            }
        }

        // --- Hare Reached the End ---
        // If the loop finishes, it means 'fast' or 'fast.next' became null,
        // indicating the Hare reached the end of the list without meeting the Tortoise.
        return false; // No cycle found.
    }

    // Helper method to create a list with a cycle for testing (optional)
    public static ListNode createListWithCycle(int[] values, int pos) {
        if (values == null || values.length == 0)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode cycleNode = null;
        ListNode tail = null;

        for (int i = 0; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) {
                cycleNode = current; // Remember the node where the cycle should start
            }
            if (i == values.length - 1) {
                tail = current; // Remember the tail node
            }
        }

        if (tail != null && cycleNode != null) {
            tail.next = cycleNode; // Connect the tail to the cycle node
        }

        return dummy.next;
    }

    // Example Usage (optional, for testing)
    public static void main(String[] args) {
        LinkedListLoopCycle sol = new LinkedListLoopCycle();

        // Example 1: head = [3,2,0,-4], pos = 1 -> true
        ListNode head1 = createListWithCycle(new int[] { 3, 2, 0, -4 }, 1);
        System.out.println("Example 1 has cycle: " + sol.hasCycle(head1)); // Expected: true

        // Example 2: head = [1,2], pos = 0 -> true
        ListNode head2 = createListWithCycle(new int[] { 1, 2 }, 0);
        System.out.println("Example 2 has cycle: " + sol.hasCycle(head2)); // Expected: true

        // Example 3: head = [1], pos = -1 -> false
        ListNode head3 = createListWithCycle(new int[] { 1 }, -1); // pos = -1 means no cycle
        System.out.println("Example 3 has cycle: " + sol.hasCycle(head3)); // Expected: false

        // Example 4: head = [], pos = -1 -> false
        ListNode head4 = createListWithCycle(new int[] {}, -1);
        System.out.println("Example 4 has cycle: " + sol.hasCycle(head4)); // Expected: false
    }
}
