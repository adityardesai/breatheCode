package org.usc.edu;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDup {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode curr = head;
        ListNode p = head.next;
        
        while(p!=null){
            
            if(p.val == curr.val){
                curr.next = p.next;
                p=p.next;
            }
            else{
                curr = p;
                p = p.next;
            }
        }

     return head;   
    }
}