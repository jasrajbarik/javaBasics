package javaBackend.sept23.constructors.basics;

class StudentNew {
    String name;
    int age;

    StudentNew(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    void displayDetails() {
        System.out.print("Name : " + name);
        System.out.println("\nAge: " + age);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        StudentNew st0 = new StudentNew("Jasraj",28);
        StudentNew st1 = new StudentNew("Raj", 35);
        StudentNew st2 = new StudentNew("Rahul",27);

        st2.displayDetails();
        st0.displayDetails();
        st1.displayDetails();
    }
}

