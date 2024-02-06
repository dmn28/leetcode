/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode tmp = head;
        while (tmp != null) {
            stack.push(tmp.val);
            tmp = tmp.next;
        }

        ListNode reversed = null;

        if (stack.empty()) {
            return null;
        } else {
            reversed = new ListNode(stack.pop());
        }

        tmp = reversed;
        while (!stack.empty()) {
            tmp.next = new ListNode(stack.pop());
            tmp = tmp.next;
        }

        return reversed;
    }
}
