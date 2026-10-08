package javaBackend.sept23.constructors.basics;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul");

        Employee e3 = new Employee("Himadri", 50000);

        Employee e4 = new Employee("Raj", 70000, "IT");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}