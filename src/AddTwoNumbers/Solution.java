package AddTwoNumbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resL = new ListNode(0);
        ListNode p = l1,q = l2,curr = resL;
        int cnt = 0 , sum = 0;
        while (q != null || p != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            curr.next = new ListNode(0);
            curr = curr.next;
            sum = x + y + cnt;
            curr.val = sum % 10 ;
            cnt = sum / 10;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (cnt > 0){
            curr.next = new ListNode(cnt);
        }

        return resL.next;
    }
}
