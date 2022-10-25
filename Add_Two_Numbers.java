import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        // ?You are given two non-empty linked lists representing two non-negative
        // integers. The digits are stored in reverse order, and each of their nodes
        // contains a single digit. Add the two numbers and return the sum as a linked
        // list.
        // ?You may assume the two numbers do not contain any leading zero, except the
        // number 0 itself.

        // class Solution {
        // * Add Two Numbers (Java improved)
        // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode dummyHead = new ListNode(0);
        // ListNode curr = dummyHead;
        // int carry = 0;
        // while (l1 != null || l2 != null || carry != 0) {
        // int x = (l1 != null) ? l1.val : 0;
        // int y = (l2 != null) ? l2.val : 0;
        // int sum = carry + x + y;
        // carry = sum / 10;
        // curr.next = new ListNode(sum % 10);
        // curr = curr.next;
        // if (l1 != null)
        // l1 = l1.next;
        // if (l2 != null)
        // l2 = l2.next;
        // }
        // return dummyHead.next;
        // }
        // }

        int[] a1 = { 2, 4, 3 };
        int[] a2 = { 5, 6, 4 };
        // convert array into string without space
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a1.length; i++) {
            sb.append(a1[i]);
        }
        int a = parseInt(sb.toString());
        System.out.println(a);
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < a2.length; i++) {
            sb1.append(a2[i]);
        }
        int b = parseInt(sb1.toString());
        System.out.println(b);
        int c = a + b;
        // split int element into array element
        // int[] arr = new int[c];
        int[] arr;
        System.out.println(c);
        // int i = 0;
        // while (i < a) {
        // arr[i] = a1[i];
        // i++;
        // }

    }

}
