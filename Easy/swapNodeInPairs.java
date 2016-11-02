/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode point = new ListNode(0);
        point.next = head;
        head = point;
        while (point.next != null && point.next.next != null) {
            ListNode tmp = point.next.next.next;
            point.next.next.next = point.next;
            point.next = point.next.next;
            point = point.next.next;
            point.next = tmp;
        }
        return head.next;
    }
}