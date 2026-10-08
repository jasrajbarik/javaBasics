package classroomProjects.com.kodewala.Strings;

class Student {

    String name;
    int age;
    int rollNumber;

    Student(String name, int age, int rollNumber) {

        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {

        return "Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber;
    }
}

public class ToStringMethod {

    public static void main(String[] args) {

        Student s1 = new Student("Jass", 21, 101);

        System.out.println(s1);
    }
}