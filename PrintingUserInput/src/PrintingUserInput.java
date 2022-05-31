import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userInputList = new ArrayList<>();
        System.out.println("Please enter your inputs to be printed! You may enter as much as you'd like. Enter an empty line when finished.");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                userInputList.stream()
                        .forEach(input -> System.out.println(input));
                break;
            }

            userInputList.add(userInput);

        }

    }
}