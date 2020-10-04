// Reverse a singly linked list.

// Example:
// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL
// Follow up:

// A linked list can be reversed either iteratively or recursively. Could you implement both?


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode oCurrent = head, oPrev = null, oTmp;
        
        // swap the list
        while(oCurrent !=null){
            oTmp = oCurrent.next; // store refference to the next ptr on the list
            oCurrent.next = oPrev; // reverse direction of ptr from null 1->2->...  to null<-1 2->...
            oPrev = oCurrent; // store refference to oCurrent ptr
            oCurrent = oTmp; // move the current to the next node on list
        }  
        
        return oPrev; // return the new "head" of our list  
    }
}