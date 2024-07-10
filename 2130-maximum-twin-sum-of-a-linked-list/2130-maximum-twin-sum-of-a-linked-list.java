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
    public int pairSum(ListNode head) {
        // if(head==null || head.next==null){
        //     return true;
        // }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=reverse(slow);
        ListNode temp1=head;
        ListNode temp2=mid;
        int max=0;
        while(temp1!=slow && temp2!=null){
            if(max<(temp1.val+temp2.val)){
                max=(temp1.val+temp2.val);
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return max;
    }
    static ListNode reverse(ListNode slow){
        ListNode pre=null;
        ListNode curr=slow;
        ListNode aft=null;
        while(curr!=null){
            aft=curr.next;
            curr.next=pre;
            pre=curr;
            curr=aft;
            
        }
        return pre;
    }
}