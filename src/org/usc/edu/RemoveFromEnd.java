package org.usc.edu;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        if (n <= 0) {
            return null;
        }
        ListNode slow = new ListNode(0);
        ListNode prevNode = new ListNode(0);
        ListNode currNode = new ListNode(0);
        currNode = head;
        slow = head;
        
       for(int i=0;i<n;i++)
       {
           currNode = currNode.next;
       }
       
        if(currNode == null){
        head = head.next;
        return head;
        }
        while(currNode.next != null){
        currNode = currNode.next;
        slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
