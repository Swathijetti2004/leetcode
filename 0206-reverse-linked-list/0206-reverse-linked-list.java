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
    public ListNode reverseList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        else if(head.next.next==null){
            ListNode temp=head.next;
            head.next=null;
            temp.next=head;
            head=temp;
            return head;
        }
        else{
            ListNode temp1,curr,temp2;
            temp1=head;
            curr=head;
            temp2=head.next;
            temp1.next=null;
            while(temp2!=null){
                curr=temp2;
                temp2=temp2.next;
                curr.next=temp1;
                temp1=curr;
            }
            return curr;
        }
    }
}