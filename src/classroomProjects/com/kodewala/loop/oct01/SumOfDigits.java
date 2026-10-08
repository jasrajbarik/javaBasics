package classroomProjects.com.kodewala.loop.oct01;

import java.util.Scanner;

public class SumOfDigits {
    void calculateSum(int num) {
        int sum =0;
        do {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        } while(num>0);
        System.out.println("Sum of Digits : "+sum);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its sum of digits: ");
        int input = sc.nextInt();

        SumOfDigits number = new SumOfDigits();
        number.calculateSum(input);
    sc.close();
    }
}
