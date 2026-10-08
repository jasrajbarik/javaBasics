package javaBackend.sept23.constructors.basics;

/*Create a Student class with name and age.
Create a no-argument constructor that assigns default values.
Create an object and display the details.
 */

class SimpleStudent {
    String name;
    int age;

    SimpleStudent() {
        name = "unknown";
        age = 0;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class SimpleStudentDriver {
    public static void main(String[] args) {
        SimpleStudent stud = new SimpleStudent();
        stud.displayDetails();
    }
}
