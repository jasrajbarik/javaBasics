package classroomProjects.com.kodewala.constructors.basics.constructor3;
class SuperUser extends Object
{

}
public class User extends SuperUser
{
    String userName;
    String userId;
    String mobile;

    User(String _userName, String _userId, String _mobile)
    {
        this(300);
        this.userId=_userId;
        this.userName=_userName;
        this.mobile=_mobile;
    }
    User(int amount)
    {
        this();
        System.out.println("User(int) called with this(300) ");
    }
    User()
    {
        System.out.println("User() called using this() ");
    }
}
