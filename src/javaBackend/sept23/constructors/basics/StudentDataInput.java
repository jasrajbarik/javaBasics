package javaBackend.sept23.constructors.basics;
import java.util.Scanner;

/* Create a Student class with name, age, rollNumber, and section.
Take all values from the user and pass them to the constructor.
 */

class StudentData {
    String name;
    int age;
    int rollNumber;
    String section;

    StudentData(String _name, int _age, int _rollNumber, String _section) {
        name = _name;
        age = _age;
        rollNumber = _rollNumber;
        section = _section;
        System.out.println("Inside Constructor");
    }
    void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNumber);
        System.out.println("Section: "+section);
    }
}

public class StudentDataInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        int rollNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        StudentData stud = new StudentData(name, age, rollNumber, section);
        stud.displayDetails();
        sc.close();
    }
}