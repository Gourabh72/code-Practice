package streamQuestion;

import java.util.Comparator;
import java.util.List;

public class Question17 {
    public static void main(String[] args) {
        //Find 'first' name of 'oldest' person in a list of objects
        List<Person> persons=List.of(
                new Person("John", "Doe", 25),
                new Person("Jane", "Smith", 30),
                new Person("Alice", "Johnson", 28)
        );
        persons.stream().max(Comparator.comparingInt(Person::getAge))
                .ifPresent(p->System.out.println(p.getFirstName()));
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
