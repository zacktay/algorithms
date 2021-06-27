public class AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;
            int sum = l1Value + l2Value + carry;

            result.next = new ListNode(sum % 10);
            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }

            result = result.next;
        }
        return head.next;
    }

}
