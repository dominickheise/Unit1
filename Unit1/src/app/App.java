package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is my name?");
        String Q1 = input.nextLine();
        if (Q1.equals("Dominick"))
            System.out.println("CORRECT");
        else System.out.println("INCORRECT");
         System.out.println("What is the capital city of Korea");
        String Q2 = input.nextLine();
        if (Q2.equals("Seoul"))
            System.out.println("CORRECT");
        else System.out.println("INCORRECT");
         System.out.println("What month is it?");
        String Q3 = input.nextLine();
        if (Q3.equals("May"))
            System.out.println("CORRECT");
        else System.out.println("INCORRECT");
    }}      