package javaBackend.sept23.constructors.basics;

class Employee {

    String name;
    double salary;
    String department;

    Employee() {

        name = "NO argu";
        salary = 0;
        department = "No Argument";
    }

    Employee(String _name) {

        this.name = _name;
        salary = 0;
        department = "No argument";
    }

    Employee(String _name, double _salary) {

        this.name = _name;
        this.salary = _salary;
        department = "No Argument";
    }

    Employee(String _name, double _salary, String _department) {

        this.name = _name;
        this.salary = _salary;
        this.department = _department;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("----------------");
    }
}