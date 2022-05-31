import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To continue entering personal information, enter anything. Otherwise, enter \"quit\" to end and print your information");
            String quit = "quit";
            if(scanner.hasNextLine()){quit = scanner.nextLine();}

            if (quit.equals("quit")) {

//if the user enters 'quit', the method will get the persons by surname, sort them, eliminate those that are not 'distinct', and prince them
                persons.stream()
                        .map(person -> person.getSurname())
                        .sorted()
                        .distinct()
                        .forEach(uniqueName -> System.out.println(uniqueName));
                break;
            }
            System.out.print("Input first name: ");
            String firstName = "NaN";
            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

    }
}