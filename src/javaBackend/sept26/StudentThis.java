package javaBackend.sept26;

class StudentThis {
    String name;
    StudentThis()
    {
        this("unknown");
        System.out.println("No argument constructor");
    }
    StudentThis(String _name)
    {
        this.name=_name;
        System.out.println("Constructor with String Argument");
    }
    void displayDetails()
    {
        System.out.println("Name: "+name);
    }
}
