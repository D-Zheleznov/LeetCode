public class _70_ClimbingStairs {

    private static final int INPUT_1 = 2;
    private static final int INPUT_2 = 3;
    private static final int INPUT_3 = 5;

    //Input: n = 3
    //Output: 3
    //1. 1 step + 1 step + 1 step
    //2. 1 step + 2 steps
    //3. 2 steps + 1 step
    //
    //Числа Фибонначи (сколько способов чтобы подняться в 1 и 2 шага)
    public static void main(String[] args) {
        System.out.println(climbStairs(INPUT_1)); //2
        System.out.println(climbStairs(INPUT_2)); //3
        System.out.println(climbStairs(INPUT_3)); //8
    }

    //Формула Fn = (Fn − 2) + (Fn − 1)
    //O(n) //O(1)
    private static int climbStairs(int num) {
        if (num < 4)
            return num;

        int[] steps = new int[num + 1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= num; i++) {
            steps[i] = steps[i - 2] + steps[i - 1];
        }
        return steps[num];
    }
}
