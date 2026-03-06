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
        ListNode temp = head;
        ListNode last=head;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next.next;
            last=last.next;
            if(temp==last)
            {
                return true;
            }
        }
        return false;
        
    }
}