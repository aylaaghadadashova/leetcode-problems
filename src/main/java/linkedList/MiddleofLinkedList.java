package linkedList;

public class MiddleofLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head; //n
        ListNode fast = head; //2n

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
