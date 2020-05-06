package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a first name.");
        String Q1 = input.nextLine();
        System.out.println("Enter a last name.");
        String Q2 = input.nextLine();
        System.out.println("Enter an Illness");
        String Q3 = input.nextLine();
        System.out.println("Enter a plural noun.");
        String Q4 = input.nextLine();
        System.out.println("Enter an adjective.");
        String Q5 = input.nextLine();
        System.out.println("Enter an adjective.");
        String Q6 = input.nextLine();
        System.out.println("Enter a silly word.");
        String Q7 = input.nextLine();
        System.out.println("Enter a place.");
        String Q8 = input.nextLine();
        System.out.println("Enter a number.");
        String Q9 = input.nextLine();
        System.out.println("Enter an adjective.");
        String Q10 = input.nextLine();
        System.out.println("Dear School Nurse:" + Q1 + " " + Q2 + " will not be attending school today. He/she has come down with a case of " + Q3 + " and has horrible " + Q4 + " and a/an " + Q5 + " fever. We have made an appointment with the " + Q6 + " Dr. " + Q7 +  " who studied for many years in " + Q8 + " and has " + Q9 + " degrees in pediatrics. He will send you all the information you need. Thank you! Sincerely Mrs. " + Q10);
    }}      