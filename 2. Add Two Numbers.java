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
        ListNode curr = dummy;
        int value=0, carry=0, sum=0;
        while(l1!=null || l2!=null) {
            if(l1!=null && l2!=null) {
                sum = l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null) {
                sum=l1.val;
                l1=l1.next;
            }
            else if(l2!=null) {
                sum=l2.val; 
                l2=l2.next;
            }
            value = (sum+carry) % 10;
            carry = (sum+carry) / 10;
            curr.next=new ListNode(value);
            curr=curr.next;
        }
        if(carry!=0) {
            curr.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
