package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

    public static void printListNode(ListNode node) {
        List<Integer> results = new ArrayList<>();
        ListNode current = node;
        while (current != null) {
            results.add(current.val);
            current = current.next;
        }
        System.out.println(Arrays.toString(results.stream()
                .mapToInt(result -> result)
                .toArray()));
    }
}
