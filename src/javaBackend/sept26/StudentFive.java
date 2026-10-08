package javaBackend.sept26;
class StudentFive {
 String name,section;
 int rollNumber, age;

 StudentFive(String _name, String _section, int _rollNumber, int _age)
 {
     name = _name;
     section = _section;
     rollNumber = _rollNumber;
     age = _age;
 }
 void displayDetails()
 {
     System.out.println("Name: "+name);
     System.out.println("Section: "+section);
     System.out.println("Roll No: "+rollNumber);
     System.out.println("Age: "+age);
 }
}
