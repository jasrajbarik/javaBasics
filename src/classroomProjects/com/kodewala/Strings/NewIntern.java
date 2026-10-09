package classroomProjects.com.kodewala.Strings;

public class NewIntern {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        System.out.println(s == s3);
        System.out.println(s == s3.intern());
    }
}
