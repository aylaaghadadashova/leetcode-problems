package linkedList;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int count = 0;
        ListNode step = head;

        while(step.next != null){
            count ++;
            step = step.next;
        }

        if (n > count + 1) {
            return null;
        }
        if(n == count + 1){
            return head.next;
        }

        ListNode step2 = head;
        int count2 = 0;
        while (count2 != count - n) {
            step2 = step2.next;
            count2++;
        }

        step2.next = step2.next.next;

        return head;
    }
}
