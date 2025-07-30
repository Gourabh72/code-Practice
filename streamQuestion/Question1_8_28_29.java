package streamQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question1_8_28_29 {

    public static void main(String[] args) {
        List<Emplyee> emplyees=new ArrayList<>();
        emplyees.add(new Emplyee(1,"Gourav","Male",27000));
        emplyees.add(new Emplyee(2,"Sourabh","Male",28000));
        emplyees.add(new Emplyee(3,"Shubham","Male",35000));
        emplyees.add(new Emplyee(4,"Bharti","Female",10000));
        emplyees.add(new Emplyee(5,"Shivani","Female",8000));

        //count of male and female
        System.out.println("count of male and female");
        emplyees.stream()
                .collect(Collectors.groupingBy(Emplyee::getGender,Collectors.counting()))
                .entrySet().forEach(System.out::println);

        //Average of female and male salary
        System.out.println("Average of female and male salary");
        emplyees.stream()
                .collect(Collectors.groupingBy(Emplyee::getGender,Collectors.averagingDouble(Emplyee::getSalary)))
                .entrySet().forEach(System.out::println);

        //collect male and female list
        System.out.println("collect male and female list");
        emplyees.stream()
                .collect(Collectors.groupingBy(Emplyee::getGender,Collectors.toList()))
                .entrySet().forEach(System.out::println);

        //filter who salary less then 30K
        System.out.println("filter who salary less then 30K");
        emplyees.stream()
                .filter(emp-> emp.getSalary()<30000)
                .toList()
                .forEach(System.out::println);

        //List 'top three highest' paid employees
        System.out.println("List 'top three highest' paid employees");
        emplyees.stream()
                .sorted((x,y)-> x.getSalary()<y.getSalary()?1:-1)
                .limit(3)
                .forEach(System.out::println);

        //2nd highest salary employee
        System.out.println("2nd highest salary employee");
        Optional<Emplyee> emp=emplyees.stream()
                .sorted(Comparator.comparingDouble(Emplyee::getSalary).reversed())
                .skip(1)
                .findFirst();
        emp.ifPresent(System.out::print);

    }

}
class Emplyee{
    private int id;
    private String name;
    private String gender;
    private double salary;

    public Emplyee(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
