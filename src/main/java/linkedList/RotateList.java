package linkedList;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int count = 0;
        ListNode node = head;
        while (node != null){
            count++;
            node = node.next;
        }

        k = k % count;

        for(int i = 0; i < k; i++){
            ListNode prev = head;
            ListNode curr = head.next;

            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }

            curr.next = head;
            prev.next = null;
            head = curr;
        }

        return head;
    }
}
