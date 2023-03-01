import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 0, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Welcome to Silvjos ATM");
            System.out.println("Press a button for any operation you want");
            System.out.println("1) Withdraw");
            System.out.println("2) Deposit");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the money you want to withdraw :");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw)
                    {
                        balance -= withdraw;
                        System.out.println("Please collect your money!");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money you want to deposit :");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited !");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance is: " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Thank you for choosing us! ");
                    System.exit(0);
            }
        }
    }
}
