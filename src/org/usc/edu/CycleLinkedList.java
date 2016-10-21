package org.usc.edu;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CycleLinkedList {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return Boolean.FALSE;
        }
        ListNode slow = head;
        ListNode fast = head;
        Boolean flag = Boolean.FALSE;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = Boolean.TRUE;
                break;
            }
        }
        return flag;
    }
}