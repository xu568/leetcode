/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode plusOne(ListNode head) {
        Stack <ListNode> s = new Stack<ListNode>();
        ListNode curr = head;
        while (curr != null) {
        	s.push(curr);
        	curr = curr.next;
        }
        int carry = 1;
        ListNode temp = head;
        while (!s.isEmpty()) {
        	temp = s.pop();
        	int value = temp.val + carry;
        	temp.val = value % 10;
        	carry = value > 9 ? 1 : 0;
        }
        if (carry == 1) {
        	ListNode h = new ListNode(1);
        	h.next = temp;
        	temp = h;
        }
        return temp;
    }
}