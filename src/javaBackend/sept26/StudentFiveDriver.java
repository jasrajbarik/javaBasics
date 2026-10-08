package javaBackend.sept26;

import java.util.Scanner;

public class StudentFiveDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentFive[] std = new StudentFive[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("\nStudent "+(i+1)+" details: ");
            System.out.print("Name: ");
            String name =sc.nextLine();
            System.out.print("Section: ");
            String section = sc.nextLine();
            System.out.print("Enter Roll No: ");
            int rollNumber = sc.nextInt();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            std[i] = new StudentFive(name,section,rollNumber,age);
        }
        System.out.println("\nAll Students: ");
        for(StudentFive st: std)
        {
            st.displayDetails();
        }
        sc.close();
    }
}
