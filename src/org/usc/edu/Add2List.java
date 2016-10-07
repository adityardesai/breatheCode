package org.usc.edu;

 
 
public class Add2List {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result=new ListNode(0) ;
        ListNode cur = result;
        int carry=0;
        
        while(temp1!=null || temp2!=null || carry!=0)
        {
            int sum=carry;
            if(temp1!=null)
            {
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
                sum+=temp2.val;
                temp2=temp2.next;
            }
            carry = sum/10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            cur.next = node;
            cur = cur.next;
           
        }
        return result.next;
    }
}
