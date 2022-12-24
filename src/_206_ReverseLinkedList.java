public class _206_ReverseLinkedList {

    //Развернуть односвязный список
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        reverseList(node1);

        ListNode current = node5;
        while (current != null) {
            System.out.println(current.val); //[5,4,3,2,1]
            current = current.next;
        }
    }

    //O(n) //O(1)
    private static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    private static class ListNode {
        private int val;
        private ListNode next;

        private ListNode(int val) {
            this.val = val;
        }

        private ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
