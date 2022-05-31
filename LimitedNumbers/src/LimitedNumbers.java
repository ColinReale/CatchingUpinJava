import java.util.Scanner;
import java.util.ArrayList;


public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println("Please enter integers. When you enter a negative number, this exercise will end and you will have all your inputs returned to you, except for the ones greater than 5. Those I will keep for myself, sorry.");
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput < 0) {
                intList.stream()
                        .filter(num -> num <= 5)
                        .forEach(num-> System.out.println(num + "..."));
                break;
            }
            intList.add(userInput);
        }
    }
}