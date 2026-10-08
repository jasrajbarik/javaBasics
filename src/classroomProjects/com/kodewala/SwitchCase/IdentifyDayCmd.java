package classroomProjects.com.kodewala.SwitchCase;

import java.util.Scanner;

public class IdentifyDayCmd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        IdentifyDayCmd id = new IdentifyDayCmd();
        id.identifyDay(n);
    }
    void identifyDay(int n) {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid input 1-7");
                break;
        }
    }
}
