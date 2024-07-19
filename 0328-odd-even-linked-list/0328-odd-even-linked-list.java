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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode evenHead=head.next;
        ListNode oddHead=head;
        ListNode evenTemp=evenHead;
        ListNode oddTemp=oddHead;
        while(evenTemp!=null  && evenTemp.next!=null){
            oddTemp.next=oddTemp.next.next;
            oddTemp=oddTemp.next;
            evenTemp.next= evenTemp.next.next;
            evenTemp= evenTemp.next;
        }
        oddTemp.next=evenHead;
        return head;
    }
}