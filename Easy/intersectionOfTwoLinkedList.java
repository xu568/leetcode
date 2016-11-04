/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a!=null) {
            lenA++;
            a = a.next;
        }
        while (b!=null) {
            lenB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        int diff = 0;
        if (lenA < lenB) {
            a = headB;
            b = headA;
            diff = lenB-lenA;
        } else {
            diff = lenA-lenB;
        }
        while (diff > 0) {
            a = a.next;
            diff--;
        }
        while (a != null && a.val != b.val) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}