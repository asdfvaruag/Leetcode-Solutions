import java.util.*;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while (l1 != null) {
            st1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            st2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = null;
        while (st1.size() > 0 || st2.size() > 0 || carry > 0) {
            int sum = carry;
            if (st1.size() > 0) {
                sum += st1.pop();
            }
            if (st2.size() > 0) {
                sum += st2.pop();
            }
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
            carry = sum / 10;
        }
        return head;
    }

    public static void main(String[] args) {
        Add_Two_Numbers obj = new Add_Two_Numbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ans = obj.addTwoNumbers(l1, l2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}