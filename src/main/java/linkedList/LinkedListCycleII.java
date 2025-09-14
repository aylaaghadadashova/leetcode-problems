package linkedList;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        int pos = -1;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                pos = 0;
                ListNode curr = slow;
                while(curr.next != null){
                    ListNode temp = curr.next;
                    curr.next = null;
                    curr = temp;
                }
                break;
            }

        }

        if(pos == -1){
            return null;
        }

        ListNode left = head;
        while(left.next != null){
            left = left.next;
        }

        return left;
    }
}
