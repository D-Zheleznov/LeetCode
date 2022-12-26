import java.util.*;

public class _202_HappyNumber {

    private static final int INPUT_1 = 19;
    private static final int INPUT_2 = 2;
    private static final int INPUT_3 = 11;

    //Input: n = 19
    //Output: true
    //Explanation:
    //(1 * 1) + (9 * 9) = 82
    //(8 * 8) + (2 * 2) = 68
    //(6 * 6) + (8 * 8) = 100
    //(1 * 1) + (0 * 0) + (0 * 0) = 1
    //
    //Найти число которое в цикле разбивается на квадраты чисел сумма которых равна 1
    //В ином случае определить бесконечный цикл
    public static void main(String[] args) {
        System.out.println(isHappy(INPUT_1)); //true
        System.out.println(isHappy(INPUT_2)); //false
        System.out.println(isHappy(INPUT_3)); //false
    }

    //Алгоритм Флойда по поиску циклов с двумя указателями (черепаха-кролик)
    //O(Log(n)) //O(1)
    private static boolean isHappy(int num) {
        int slowRunner = num;
        int fastRunner = getNext(num);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

    //O(Log(n)) //O(Log(n))
    private static boolean isHappy2(int num) {
        Set<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = getNext(num);
        }
        return num == 1;
    }

    private static int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            num = num / 10;
            sum += d * d;
        }
        return sum;
    }
}
