public class _70_ClimbingStairs {

    //Input: n = 3
    //Output: 3
    //1. 1 step + 1 step + 1 step
    //2. 1 step + 2 steps
    //3. 2 steps + 1 step
    //
    //Числа Фибонначи (сколько способов чтоб подняться в 1 и 2 шага)
    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 3;
        int input3 = 5;

        System.out.println(climbStairs(input1)); //2
        System.out.println(climbStairs(input2)); //3
        System.out.println(climbStairs(input3)); //8
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
