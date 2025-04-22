/**
 * Definition for singly-linked list.
 * (This class is usually provided by LeetCode)
 */
class ListNode {
    int val;        // The digit stored in this node (card)
    ListNode next;  // The link to the next node (card) in the chain

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddSum {
    /**
     * Adds two numbers represented by linked lists, where digits are in reverse order.
     *
     * Analogy: Performing elementary school addition column-by-column on numbers
     * written backwards on linked strips of paper (cards).
     *
     * @param l1 The head of the first linked list (first number).
     * @param l2 The head of the second linked list (second number).
     * @return The head of a new linked list representing the sum, also in reverse order.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head helps simplify adding the first node to the result list.
        // Imagine it's a placeholder card before the real answer starts.
        ListNode dummyHead = new ListNode(0);
        // 'current' pointer will build the result list, starting from the dummy.
        ListNode current = dummyHead;

        ListNode p1 = l1; // Pointer to traverse the first list (first number chain).
        ListNode p2 = l2; // Pointer to traverse the second list (second number chain).
        int carry = 0;    // Initialize carry to 0.

        // Loop as long as there are digits in either list OR there is a carry left over.
        while (p1 != null || p2 != null || carry != 0) {
            // Get the value from the current node of l1, or 0 if l1 is finished.
            int val1 = (p1 != null) ? p1.val : 0;
            // Get the value from the current node of l2, or 0 if l2 is finished.
            int val2 = (p2 != null) ? p2.val : 0;

            // Calculate the sum for this "column" (digit position).
            // Analogy: Add the digits on the current cards plus any carry from the last step.
            int sum = val1 + val2 + carry;

            // Calculate the carry for the *next* step (integer division by 10).
            // Analogy: If sum is 18, carry is 1. If sum is 7, carry is 0.
            carry = sum / 10;

            // Calculate the digit to store in the *current* result node (remainder).
            // Analogy: If sum is 18, digit is 8. If sum is 7, digit is 7.
            int digit = sum % 10;

            // Create a new node (a new card) with the calculated digit
            // and attach it to our result list.
            current.next = new ListNode(digit);

            // Move the 'current' pointer forward to the newly added node.
            current = current.next;

            // Move to the next node in l1 if it exists.
            if (p1 != null) {
                p1 = p1.next;
            }
            // Move to the next node in l2 if it exists.
            if (p2 != null) {
                p2 = p2.next;
            }
        }

        // The result list starts *after* the dummy head.
        return dummyHead.next;
    }

    // Helper method to print a linked list (for testing)
    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode current = head;
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
        AddSum sol = new AddSum();

        // Example 1: l1 = [2,4,3], l2 = [5,6,4] -> Output: [7,0,8]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result1 = sol.addTwoNumbers(l1, l2);
        System.out.print("Example 1: ");
        printList(result1);

        // Example 2: l1 = [0], l2 = [0] -> Output: [0]
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = sol.addTwoNumbers(l3, l4);
        System.out.print("Example 2: ");
        printList(result2);

        // Example 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] -> Output: [8,9,9,9,0,0,0,1]
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result3 = sol.addTwoNumbers(l5, l6);
        System.out.print("Example 3: ");
        printList(result3);
    }
}
