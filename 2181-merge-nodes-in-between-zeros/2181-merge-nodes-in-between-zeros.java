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
    public ListNode mergeNodes(ListNode head) {
        ListNode current=new ListNode();
        ListNode h=current;
        ListNode temp=head.next;
        int sum=0;
       
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }else{
                ListNode dummy=new ListNode(sum);
                current.next=dummy;
                current=dummy;
                sum=0;
            }
            temp=temp.next;
        }
        return h.next;
    }
}