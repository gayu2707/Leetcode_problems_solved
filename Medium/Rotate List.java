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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while(tail.next!=null)
        {
            length++;
            tail = tail.next;
        }
        tail.next=head;
        ListNode res = head;
        int i;
        int l = length - (k%length);
        for(i=0;i<l-1;i++)
        {
            
           res = res.next; 
        }
        ListNode temp = res.next;
        res.next = null;
        return temp;
    }
}