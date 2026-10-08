package classroomProjects.com.kodewala.constructors.basics.constructor1;

public class Driver {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.amount + " and " + acc.name);

        Account acc1 = new Account(30000, "Jasraj");
        System.out.println(acc1.amount + " and " + acc1.name);
        System.out.println(acc.name +" "+ acc1.name + " "+ acc1.amount );
    }
}



