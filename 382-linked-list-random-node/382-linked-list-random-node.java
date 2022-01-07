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
    ArrayList<Integer> values=new ArrayList<Integer>();
    public Solution(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        int i=(int)(Math.random()*values.size());
        return values.get(i);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */