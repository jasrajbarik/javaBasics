package classroomProjects.com.kodewala.constructors.basics.constructor1;

class Account
{
    int amount;
    String name;

    Account()
    {
        System.out.println("Inside Account() constructor ");
    }

    Account(int _amount, String _name)
    {
        System.out.println("Inside Account(String, int) constructor ");
        this.amount = _amount;
        this.name = _name;
    }
}
