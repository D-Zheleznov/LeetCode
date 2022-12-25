import util.ListNode;

import static util.Util.printListNode;

public class _206_ReverseLinkedList {

    private static final ListNode NODE_5 = new ListNode(5);
    private static final ListNode NODE_4 = new ListNode(4, NODE_5);
    private static final ListNode NODE_3 = new ListNode(3, NODE_4);
    private static final ListNode NODE_2 = new ListNode(2, NODE_3);
    private static final ListNode NODE_1 = new ListNode(1, NODE_2);

    //Развернуть односвязный список
    public static void main(String[] args) {
        reverseList(NODE_1);
        printListNode(NODE_5); //[5,4,3,2,1]
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
}
