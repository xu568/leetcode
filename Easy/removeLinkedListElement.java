/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode point = new ListNode(0);
        point.next = head;
        head = point;
        while (point.next != null) {
            if (point.next.val == val) {
                point.next = point.next.next;
            } else {
                point = point.next;
            }
        }
        return head.next;
    }
}