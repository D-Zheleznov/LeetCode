import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {

    //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    //answer[i] == "Fizz" if i is divisible by 3.
    //answer[i] == "Buzz" if i is divisible by 5.
    //answer[i] == i (as a string) if none of the above conditions are true.
    //
    //Создать массив по определённому шаблону
    public static void main(String[] args) {
        int input1 = 3;
        int input2 = 5;
        int input3 = 15;

        System.out.println(fizzBuzz(input1)); //["1","2","Fizz"]
        System.out.println(fizzBuzz(input2)); //["1","2","Fizz","4","Buzz"]
        System.out.println(fizzBuzz(input3)); //["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
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
