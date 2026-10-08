package classroomProjects.com.kodewala.constructors.basics.constructor5;

public class User {
    /**
     * This java class in for Hotstar
     */
    String userName;
    String type;
    String country;

    User(String _userName, String _type, String _country) {
        this.userName = _userName;
        this.type = _type;
        this.country = _country;
    }

    User() {
        this("user123", "guest_user", "India");
    }
}