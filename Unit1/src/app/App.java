package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name");
        String name1 = input.next() + input.nextLine();
        System.out.println("How much money are you starting with");
        int cash = input.nextInt();
        System.out.println("Please create password");
        String pass1 = input.next() + input.nextLine();
        System.out.println("Account created log in");
        System.out.println("Enter your name");
        String name2 = input.next() + input.nextLine();
        System.out.println("Enter your password");
        String pass2 = input.next() + input.nextLine();

        if (pass2.equals(pass1)) {
            System.out.println("Access granted, welcome " + name1);

            int state = 1;
            while (state == 1) {
                System.out.println(
                        "What would you like to do? Press 1 to check balance, press 2 to withdraw money, press 3 to deposit money, press 4 to log out");

                int selection = input.nextInt();
                if (selection == 1) {
                    System.out.println("You have " + cash);
                } else if (selection == 2) {
                    System.out.println("You currently have " + cash);
                    System.out.println("How much would you like to withdraw?");
                    int withdraw = input.nextInt();
                    if (withdraw > cash) {
                        System.out.println("insufficient funds");
                    } else {
                        cash = cash - withdraw;
                    }
                    System.out.println("You now have " + cash);
                } else if (selection == 3) {
                    System.out.println("You currently have " + cash);
                    System.out.println("How much would you like to deposit");
                    int deposit = input.nextInt();
                    cash = cash + deposit;
                    System.out.println("You now have " + cash);
                } else if (selection == 4) {
                    state = 0;
                    break;
                } else {
                    System.out.println("Invalid selection, try again");
                }

            }
        } else
            System.out.println("Access Denied");

    }

}
