package classroomProjects.com.kodewala.Strings;

public class Check {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        String s3 = b.intern();
        String c = "Hello";
        String d= "jasraj";
        String e = new String("jasraj");
        System.out.println((b==s3) +" " +(s3==c) );
        System.out.println((a!=b) + " " + (a!=c) + " " + (a!=d)+ " "+ (a!=e));
        System.out.println((a.equals(b)) + " " + (a.equals(c)) + " " + (a.equals(d))+ " "+ (a.equals(e)));
        System.out.println((!a.equals(b)) + " " + (!a.equals(c)) + " " + (!a.equals(d))+ " "+ (!a.equals(e)));
    }
}
