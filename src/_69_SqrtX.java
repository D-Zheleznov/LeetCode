public class _69_SqrtX {

    private static final int INPUT_1 = 1;
    private static final int INPUT_2 = 4;
    private static final int INPUT_3 = 8;
    private static final int INPUT_4 = 10;
    private static final int INPUT_5 = 16;
    private static final int INPUT_6 = 2_147_483_647;

    //Найти корень числа
    public static void main(String[] args) {
        System.out.println(mySqrt3(INPUT_1)); //1
        System.out.println(mySqrt3(INPUT_2)); //2
        System.out.println(mySqrt3(INPUT_3)); //2
        System.out.println(mySqrt3(INPUT_4)); //3
        System.out.println(mySqrt3(INPUT_5)); //4
        System.out.println(mySqrt3(INPUT_6)); //46340
    }

    //Двоичный поиск
    //O(Log(n)) O(1)
    private static int mySqrt(int x) {
        var left = 1;
        var right = x;

        if (x < 2)
            return x;

        while (left < right) {
            var mid = (left + right) / 2;
            var temp = x / mid;
            if (temp == mid)
                return mid;
            else if (temp < mid)
                right = mid;
            else
                left = mid + 1;
        }
        return left - 1;
    }

    //Подход сложения количества нечётных чисел
    //1 + 3 + 5 = 9 -> количество чисел = 3
    //O(n) //O(1)
    private static int mySqrt2(int x) {
        int oddCount = 1;
        int sum = 1;
        int currentOdd = 1;
        while (sum < x) {
            currentOdd += 2;
            sum += currentOdd;
            oddCount++;
        }
        return sum == x ? oddCount : oddCount - 1;
    }

    //Метод Ньютона
    //Формула (X + (N / X)) / 2
    //O(Log(n)) O(1)
    private static int mySqrt3(int x) {
        long result = x;
        while (result * result > x)
            result = (result + (x / result)) / 2;
        return (int) result;
    }
}
