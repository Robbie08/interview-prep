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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        
        ListNode oNewNode = new ListNode(0);
        oNewNode.next = head;
        
        ListNode oPrev = oNewNode;
        ListNode oCurr = head;
        
        while(oCurr != null){
            if(oCurr.val != val)
                oPrev = oCurr;
            else
                oPrev.next = oCurr.next;
            
            oCurr = oCurr.next;
        }
        
        return oNewNode.next;
        
        
    }
}