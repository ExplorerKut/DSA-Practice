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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){return null;}
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode pre=dummyNode;
        for(int i=0;i<left-1;i++){
            pre=pre.next;
        }
        ListNode start=pre.next;
        ListNode after=start.next;
        
        for(int j=0;j<right-left;j++){
            start.next=after.next;
            after.next=pre.next;
            pre.next=after;
            after=start.next;
        }
        return dummyNode.next;
            
    }
}