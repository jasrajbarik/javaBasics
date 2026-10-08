package javaBackend.sept26;

public class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(0);
        System.out.println(("Inside Employee() "));
    }
    Employee(int _id) {
        this(_id,"Unknown");
        System.out.println("Inside Employee(int)");
    }
    Employee(int _id, String _name) {
        this(_id,_name,0);
        System.out.println("Inside Employee(int, String)");
    }
    Employee(int _id, String _name, double _salary) {
        this.id=_id;
        this.name=_name;
        this.salary=_salary;
        System.out.println("Inside Employee(int, String, double)");
    }
    void displayDetails() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
