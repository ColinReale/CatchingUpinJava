import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class AverageofNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        System.out.println("Please enter the numbers you would like to average. When you are ready for your average, please enter 'end' and then enter");
        while (true) {
             String userInput = scanner.nextLine();
//             this section will use the userInputs upon the trigger of "end".
//            basically it takes the userInputs (which are strings), converts them to Integers, averages them using .average(),
//            and then converts to a Double.
            if (userInput.equals("end")) {
                double average = nums.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();
                System.out.println("average of numbers: " + average);
                break;
            }
            nums.add(userInput);

        }




    }
}