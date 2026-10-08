package javaBackend.sept26;

class Student {
    String name;
    int age,rollNumber;
    String section;

    Student(String _name, int _age, int _rollNumber, String _section) {
        name = _name;
        age = _age;
        rollNumber = _rollNumber;
        section = _section;
    }

    void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollNumber);
        System.out.println("Section: "+section);
    }
}
