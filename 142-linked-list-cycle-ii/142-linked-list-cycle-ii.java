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
    public ListNode detectCycle(ListNode head) {
        //Set<Integer> index=new HashSet<Integer>();
        //int count=0;
         if(head==null){
            
            return null;
        }
        //ListNode prev=null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            
            fast=fast.next.next;
            
            slow=slow.next;
            if(fast==slow){
                ListNode entry=head;
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}