package linkedList;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        head = curr;
        ListNode temp;

        while(true){
            temp = curr.next;
            curr.next = prev;
            if(temp == null || temp.next == null){
                prev.next = temp;
                break;
            }
            prev.next = temp.next;
            prev = temp;
            curr = temp.next;

        }

        return head;
    }
}
