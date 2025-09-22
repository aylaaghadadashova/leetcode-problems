package linkedList;

public class PartitionList {

    public static ListNode partition(ListNode head, int x) {
        if (head == null | head.next == null) return head;

        ListNode curr = head;
        ListNode dummyLess = new ListNode(0, null);
        ListNode dummyGreater = new ListNode(0, null);
        ListNode dLHead = dummyLess;
        ListNode dGHead = dummyGreater;

        while (curr != null){
            if (curr.val < x){
                dummyLess.next = new ListNode(curr.val, null);
                dummyLess = dummyLess.next;
            } else {
                dummyGreater.next = new ListNode(curr.val, null);
                dummyGreater = dummyGreater.next;
            }

            curr = curr.next;
        }

        dummyLess.next = dGHead.next;
        return dLHead.next;
    }
}

