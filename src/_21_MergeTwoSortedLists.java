import util.ListNode;

import static util.Util.arrayToListNode;
import static util.Util.printListNode;

public class _21_MergeTwoSortedLists {

    private static final ListNode NODE_1 = arrayToListNode(new int[]{1, 2, 4});
    private static final ListNode NODE_2 = arrayToListNode(new int[]{1, 3, 4});

    //Input: list1 = [1,2,4], list2 = [1,3,4]
    //Output: [1,1,2,3,4,4]
    //Слить два отсортированных односвязных списка
    public static void main(String[] args) {
        ListNode node = mergeTwoLists2(NODE_1, NODE_2);

        printListNode(node); //[1,1,2,3,4,4]
    }

    //O(n) //O(1)
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode head = node;

        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val < list2.val)) {
                node.next = list1;
                list1 = list1.next;
            }
            else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        return head.next;
    }

    //O(n) //O(1)
    private static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists2(list1, list2.next);
            return list2;
        }
    }
}
