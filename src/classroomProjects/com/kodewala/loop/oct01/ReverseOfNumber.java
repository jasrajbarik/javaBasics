package classroomProjects.com.kodewala.loop.oct01;

import java.util.Scanner;

public class ReverseOfNumber {
    static int rev;
   static void reverse(int num) {
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } while (num > 0);
        System.out.println("reverse: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        reverse(input);
        sc.close();
    }
}
