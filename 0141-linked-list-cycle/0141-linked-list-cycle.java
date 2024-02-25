/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fp=new ListNode();
        ListNode sp=new ListNode();
        fp=head;
        sp=head;
        if(fp==null){
            return false;
        }
        while(fp!=null && fp.next!=null){
            fp=fp.next.next;
            sp=sp.next;
            if(sp==fp){
                return true;
            }
        }
        return false;
    }

}