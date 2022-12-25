import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {

    private static final int INPUT_1 = 3;
    private static final int INPUT_2 = 5;
    private static final int INPUT_3 = 15;

    //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    //answer[i] == "Fizz" if i is divisible by 3.
    //answer[i] == "Buzz" if i is divisible by 5.
    //answer[i] == i (as a string) if none of the above conditions are true.
    //
    //Создать массив по определённому шаблону
    public static void main(String[] args) {
        System.out.println(fizzBuzz(INPUT_1)); //["1","2","Fizz"]
        System.out.println(fizzBuzz(INPUT_2)); //["1","2","Fizz","4","Buzz"]
        System.out.println(fizzBuzz(INPUT_3)); //["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    }

    //O(N) //O(1)
    private static List<String> fizzBuzz(int num) {
        List<String> array = new ArrayList<>(num);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0)
                sb.append("Fizz");
            if (i % 5 == 0)
                sb.append("Buzz");
            if (sb.length() == 0)
                sb.append(i);

            array.add(sb.toString());
            sb.setLength(0);
        }
        return array;
    }
}
