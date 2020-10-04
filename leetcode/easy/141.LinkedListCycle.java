// Given head, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached 
// again by continuously following the next pointer. Internally, pos is used to denote the index 
// of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.

// Follow up:
// Can you solve it using O(1) (i.e. constant) memory?

// [Example]
// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).


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