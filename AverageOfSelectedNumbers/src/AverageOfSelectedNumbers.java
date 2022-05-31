import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        System.out.println("Please enter the numbers you would like to average. When you are ready for your average, please enter 'end' and then enter");

        while (true) {
            String userInput1 = scanner.nextLine();
            if (userInput1.equals("end")) {
                System.out.println("Would you like to print the average of the negative numbers or the positive numbers? (n/p)");
                String userInput2 = scanner.nextLine();

                if(userInput2.isEmpty()){
                    continue;
                }



                if (userInput2.toLowerCase().equals("n")) {
//similar to what we did in the previous problem, except this time we employ the .filter() method to filter only negative numbers
                    double negativesAvg = nums.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble();
                    System.out.println("The average of all of your negative numbers: " + negativesAvg);

                } else if (userInput2.toLowerCase().equals("p")) {
//same thing, except this time we filter only positive numbers and zero
                    double averageOfPositives = nums.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i >= 0)
                            .average()
                            .getAsDouble();

                    System.out.println("The average of all of your positive numbers: " + averageOfPositives);

                }

                break;
            }

            nums.add(userInput1);
        }

    }
}