package javaBackend.sept26;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name= sc.nextLine();
        System.out.println("Enter Age: ");
        int age= sc.nextInt();
        System.out.println("Enter Roll No: ");
        int rollNumber= sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Section: ");
        String section = sc.nextLine();

        Student student=new Student(name,age,rollNumber,section);
        student.displayDetails();
        sc.close();
    }
}
