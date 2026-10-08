package classroomProjects.com.kodewala.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class BankCashback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Type: /n Premium Gold Silver Regular ");
        String accType = sc.nextLine();
        System.out.println("Enter Transaction Amount ");
        double amount = sc.nextDouble();
        BankCashback cash = new BankCashback();
        double cashback = cash.calculateDiscout(accType,amount);
        if(cashback!=-1)
        {
            System.out.println("Cashback: "+cashback);
            System.out.println("Final Amount: "+(amount-cashback));
        }
        sc.close();
    }

    double calculateDiscout(String accType, double amout) {
        double cashback=0;

        switch(accType.toLowerCase()) {

            case "premium":
                cashback = amout * 0.10;
                break;
            case "gold":
                cashback = amout * 0.07;
                break;
            case "silver":
                cashback = amout * .05;
                break;
            case "regular":
                cashback = amout * .02;
                break;
            default:
                System.out.println("Invalid Account Type");
                break;
        }
        if(amout<5000) {
            return 0;
        }
        if(cashback>2000)
        {
            cashback=2000;
        }
        return cashback;
    }
}
