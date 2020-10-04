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
    
        if(head == null || head.next == null)
            return false;
      
        ListNode oFast = head.next;
        ListNode oSlow = head;
        
        while(oFast != oSlow && oFast != null){
            oFast = oFast.next;
            if(oFast == null)
                return false;
            oFast = oFast.next;
            oSlow = oSlow.next;
        }
        
        if(oFast == null )
            return false;
        
        
        return true;    
    }
}