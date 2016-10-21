package org.usc.edu;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode temp = null;
		ListNode curr = new ListNode(0);
		ListNode prev = null;
		curr = head;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}
		head = prev;
		return head;

	}
}