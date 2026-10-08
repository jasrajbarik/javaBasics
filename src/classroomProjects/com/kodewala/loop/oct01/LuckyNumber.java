package classroomProjects.com.kodewala.loop.oct01;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int luckyNumber =68, userInput=0;
        Scanner sc = new Scanner(System.in);

        while(luckyNumber!=userInput)
        {
            System.out.println("Enter your Number");
            userInput=sc.nextInt();
            if(userInput==luckyNumber)
            {
                System.out.println("10 crore , congratulations ");
            }
            else
            {
                System.out.println("Galat Jawaab ");;
            }
        }
    }
}
