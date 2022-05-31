import java.util.stream.Collectors;
import java.util.ArrayList;


public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);
        divisible.stream()
                .forEach(e -> System.out.println(e));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {

        ArrayList<Integer> divisNumbers = numbers.stream()
                .filter(num ->  num % 3 ==0 || num % 2 == 0|| num % 5 ==0)
//          utilizing the imported Collectors again.
                .collect(Collectors.toCollection(ArrayList::new));
        return divisNumbers;
    }

}