

public class _86_PartitionList {
    class Solution {
    public ListNode partition(ListNode head, int x) {
        // Dummy heads for two partitions
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        
        // Pointers to build the partitions
        ListNode before = beforeHead;
        ListNode after = afterHead;
        
        // Traverse and partition the list
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        
        // End the after list and connect it to before list
        after.next = null;
        before.next = afterHead.next;
        
        return beforeHead.next;
    }
}

    
}
