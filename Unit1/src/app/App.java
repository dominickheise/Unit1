package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name");
        String name1 = input.nextLine();
        System.out.println("How much money are you starting with");
        int cash = input.nextInt();
        System.out.println("Please create password");
        String pass1 = input.nextLine();
        System.out.println("Account created log in");
         System.out.println("Enter your name");
        String name2 = input.nextLine();
        System.out.println("Enter your password");
        String pass2 = input.nextLine();
        
        if (name2.equals(name1)) {
    } else System.out.println("Access denied");
        if (pass2.equals(pass1)){
            System.out.println("Access granted");
        } else System.out.println("Access denied");



    }}