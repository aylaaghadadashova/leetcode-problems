package linkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode step1 = head;
        ListNode step2 = head;

        while (step2 != null && step2.next != null){
            step1 = step1.next;
            step2 = step2.next.next;

            if(step1 == step2){
                return true;
            }
        }
        return false;
    }
}
