package linkedList;

public class ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode beforeLeft = new ListNode(0, head);

        for(int i = 0; i < left-1; i++){
            beforeLeft = beforeLeft.next;
        }

        ListNode leftNode = beforeLeft.next;
        ListNode prev = leftNode;
        ListNode curr = leftNode.next;
        ListNode temp;
        int count = left;

        while(count != right){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }

        beforeLeft.next = prev;
        leftNode.next = curr;

        if (left == 1){
            return beforeLeft.next;
        }
        return head;
    }
}
