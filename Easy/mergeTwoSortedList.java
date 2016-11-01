/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head;
        if (curr1.val > curr2.val) {
            head = curr2;
            curr2 = curr2.next;
        } else {
            head = curr1;
            curr1 = curr1.next;
        }
        ListNode curr = head;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                curr.next = curr1;
                curr1 = curr1.next;
                curr = curr.next;
            } else {
                curr.next = curr2;
                curr2 = curr2.next;
                curr = curr.next;
            }
        }
        if (curr1 != null) {
            curr.next = curr1;
        } else {
            curr.next = curr2;
        }
        return head;
    }
}