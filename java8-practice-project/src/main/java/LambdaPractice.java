import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPractice {

    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(
                new Employee("Zan", "Tos", 23, "London"),
                new Employee("Fred", "Pass", 45, "Australia"),
                new Employee("Dony", "Trek", 34, "Chaina"),
                new Employee("Romo", "Baru", 77, "Peru")
        );

        //Print list of employees
        printConditionally(employeeList, e -> true); //Simply making condition to true to print all

        //Sort by First Name, Use Comparator.comparing and print list
        Comparator<Employee> firstNameComparator = Comparator.comparing(Employee::getFirstName);


        Collections.sort(employeeList, firstNameComparator);
        printConditionally(employeeList, e -> true);

        //Sort by Last Name and use Comparable.compareTo and print list
        Collections.sort(employeeList, (e1, e2) -> e1.getLastName().compareTo(e2.getLastName()));
        printConditionally(employeeList, e -> true);

        //Print employee where location is Australia
        printConditionally(employeeList, e -> e.getLocation().equalsIgnoreCase("Australia"));
    }

    public static void printConditionally(List<Employee> employeeList, Predicate<Employee> predicate){
        System.out.println("======");
        for(Employee employee : employeeList){
            if(predicate.test(employee)){
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String location;

    public Employee(String firstName, String lastName, int age, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}