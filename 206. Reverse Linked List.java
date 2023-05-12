class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        ListNode next;
        while(current!=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
