package javaBackend.sept23.constructors.basics;

class Student {
    String name;
    int age;

    Student(String _name,int _age) {
        this.name = _name;
        this.age = _age;
    }
    void display() {
        System.out.println("Inside Student Class");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
