class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // return current node
        if(head == null) return head;

        // while returning from stack assigning it to head.next
        head.next = removeElements(head.next, val);

        // if current node == val then return next value
        if(head.val == val) return head.next;

        // return current node
        return head;
    }
}