/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode third = second.next;
        head.next = null;
        while(third != null) {
        	second.next = first;
        	first = second;
        	second = third;
        	third = second.next;
        }
        second.next = first;
        return second;
    }
}