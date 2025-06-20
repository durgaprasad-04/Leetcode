/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry=0;

        //traverse the both lists
        while(l1!=null || l2!=null || carry!=0){
            // get current values (or o if null)
            int val1=(l1!=null)? l1.val:0;
            int val2=(l2!=null)? l2.val:0;
            //add values and carry
            int sum =val1+val2+carry;
            // new digit and carry
            carry=sum/10;
            int digit =sum%10;
            //create new node for digit
            current.next= new ListNode(digit);
            current=current.next;
            //move to next nodes
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}