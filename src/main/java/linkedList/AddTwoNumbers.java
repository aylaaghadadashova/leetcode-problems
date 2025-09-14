package linkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int reminder = 0;

        ListNode newNode = new ListNode();
        ListNode prev = null;
        ListNode newHead = newNode;

        while (ptr1 != null || ptr2 != null) {
            int x = (ptr1 != null) ? ptr1.val : 0;
            int y = (ptr2 != null) ? ptr2.val : 0;

            newNode.val = (x + y + reminder) % 10;
            reminder = (x + y + reminder) / 10;

            if (ptr1 != null) ptr1 = ptr1.next;
            if (ptr2 != null) ptr2 = ptr2.next;

            newNode.next = new ListNode();
            prev = newNode;
            newNode = newNode.next;
        }

        if (reminder == 1) {
            newNode.val = reminder;
        } else {
            prev.next = null; // artıq boş node silinir
        }

        return newHead;
    }
}
