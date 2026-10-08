package javaBackend.sept23.constructors.basics;


import java.util.Scanner;

class StudentArr {

    String name;
    int age;
    int rollNumber;
    String section;

    StudentArr(String _name, int _age, int _rollNumber, String _section) {

        name = _name;
        age = _age;
        rollNumber = _rollNumber;
        section = _section;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Section: " + section);
        System.out.println("***************");
    }
}

public class StudentArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentArr[] stud = new StudentArr[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nFor Student " + (i + 1)+ " | Enter Details : ");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter roll number: ");
            int rollNumber = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter section: ");
            String section = sc.nextLine();

            stud[i] = new StudentArr(name, age, rollNumber, section);  //array object declaration , calling constructor
        }

        System.out.println("\nAll Students:");

        for (int i =0; i<5; i++) {         //for (StudentArr student : stud) {
            stud[i].displayDetails();      //student.displayDetails();
        }

        sc.close();
    }
}