package classroomProjects.com.kodewala.Arrays.sept30;

public class UserDriver {
    public static void main(String[] args) {
        User user1 = new User("Jasraj","9012695644");
        User user2 = new User("Ajay","7985665656");
        User user3 = new User("Vijay","7879004659");
        User user4 = new User("Akshay","8521054457");
        User user5 = new User("Salman","7856021455");

        User[] users = new User[5];
        users[0]=user1;
        users[1]=user2;
        users[2]=user3;
        users[3]=user4;
        users[4]=user5;
        System.out.println(users);

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name);
            System.out.println(users[i].mobile);
        }
    }

}
