import AddTwoNumbers.ListNode;
import AddTwoNumbers.Solution;

public class Main {

    public static void main(String[] args) {
        ListNode L1 = new ListNode(0);
        ListNode L11 = new ListNode(4);
        ListNode L12 = new ListNode(3);
        L11.next = L12;
        L1.next = L11;
        ListNode L2 = new ListNode(5);
        ListNode L21 = new ListNode(6);
        ListNode L22 = new ListNode(4);
        L2.next = L21;
        L21.next = L22;

        ListNode n1 = Solution.addTwoNumbers(L1,L2);

        System.out.println("num1:" + n1.val + " num2:" + n1.next.val + " num3:" + n1.next.next.val);

    }
}
