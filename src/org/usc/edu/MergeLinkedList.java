package org.usc.edu;

public class MergeLinkedList {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		ListNode res = new ListNode(0);

		if (l1 == null) {
			return l1;
		} else if (l2 == null) {
			return l2;
		}

		else {
			while (temp1 != null || temp2 != null) {
				if (temp1.val > temp2.val) {
					ListNode temp = new ListNode(temp2.val);
					temp.next = null;
					res.next = temp;
				} else if (temp2.val > temp1.val) {
					ListNode temp = new ListNode(temp1.val);
					temp.next = null;
					res.next = temp;
				}
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			while (temp1 != null) {
				ListNode temp = new ListNode(temp1.val);
				temp.next = null;
				res.next = temp;
				temp1 = temp1.next;
			}

			while (temp2 != null) {
				ListNode temp = new ListNode(temp2.val);
				temp.next = null;
				res.next = temp;
				temp2 = temp2.next;
			}
		}
		return res;
	}

	public static void main(String[] args) {
	}

}
