package recursion;

import linkedList.ListNode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;


        ListNode temp = curr.next;
        curr.next = prev;
        prev.next = swapPairs(temp);

        return curr;
    }
}
