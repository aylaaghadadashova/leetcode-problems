package recursion;

import linkedList.ListNode;

public class ReverseNodesinKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k == 0 || k == 1){
            return head;
        }

        ListNode checkNull = head;
        for (int i = 0; i < k; i++){
            if (checkNull == null){
                return head;
            }
            checkNull = checkNull.next;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = null;

        for(int i = 0; i < k-1; i++){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head.next = reverseKGroup(temp, k);

        return prev;
    }
}
