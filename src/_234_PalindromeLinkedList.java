import util.ListNode;

import java.util.ArrayList;
import java.util.List;

import static util.Util.arrayToListNode;

public class _234_PalindromeLinkedList {

    private static final ListNode NODE_1 = arrayToListNode(new int[]{1, 2, 2, 1});

    //[1,2,2,1]
    //Проверка что связный список палиндром
    public static void main(String[] args) {
        System.out.println(isPalindrome(NODE_1)); //true
    }

    //Техника двух указателей
    //O(n) //O(n)
    private static boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }
        int front = 0;
        int back = values.size() - 1;
        while (front < back) {
            if (!values.get(front).equals(values.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    //Разворот второй части списка и сравнение элементов по порядку
    //O(n) //O(1)
    private static boolean isPalindrome2(ListNode head) {
        if (head == null)
            return true;

        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        ListNode half1 = head;
        ListNode half2 = secondHalfStart;
        boolean result = true;
        while (result && half2 != null) {
            if (half1.val != half2.val)
                result = false;

            half1 = half1.next;
            half2 = half2.next;
        }

        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    //Поиск середины списка
    //Два указателя, первый проходит список в 2 раза медленее второго и определяет середину
    private static ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
