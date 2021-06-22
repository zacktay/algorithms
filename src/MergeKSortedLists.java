import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

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

    public ListNode mergeKLists(ListNode[] lists) {
        // For cases where list is empty or list is null
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));

        ListNode dummy = new ListNode(0);
        ListNode end = dummy;

        // Adds to queue
        // e.g. list = [ n1 [n1.1, n1.2], n2 [n2.1, n2.2], n3 [n3.1, n3.2] ]
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        // queue => n3 -> n2 -> n1
        while (!queue.isEmpty()) {
            // Remove from queue
            // removes n1 from queue ( n3 -> n2 )
            end.next = queue.poll();
            end = end.next;

            // If node has more items, add them to queue
            // queue                        node
            // 1. n1.1 -> n3 -> n2          dummy = tails -> n1 -> n2 -> n3 -> n1.1 -> n2.1 -> n3.1 -> n1.2 -> n2.2 -> n3.2
            // 2. n2.1 -> n1.1 -> n3
            // 3. n3.1 -> n2.1 -> n1.1
            // 4. n1.2 -> n3.1 -> n2.1
            // 5. n2.2 -> n1.2 -> n3.1
            // 6. n3.2 -> n2.2  -> n1.2
            // 7. n3.2 -> n2.2
            // 8. n3.2
            // 9. null
            if (end.next != null) {
                queue.add(end.next);
            }
        }

        // n1
        return dummy.next;
    }

}
