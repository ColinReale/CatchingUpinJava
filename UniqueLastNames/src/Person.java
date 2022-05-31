//person class which has different information inside of it- firstName, lastName, birthYear- which can be accessed/called upon in the main method.
public class Person {
    private String firstName;
    private String surname;
    private int yearBorn;

    public Person(String firstName, String surname, int yearBorn) {
        this.firstName = firstName;
        this.yearBorn = yearBorn;
        this.surname = surname;

    }

    public String getSurname() {
        return surname;
    }


}