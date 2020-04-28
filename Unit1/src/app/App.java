package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        String firstname = input.nextLine();
        System.out.println("Please enter your last name.");
        String lastname = input.nextLine();
        System.out.println("Please enter your age.");
        String age = input.nextLine();
        System.out.println("Please enter your grade.");
        String grade = input.nextLine();
        System.out.println("Please enter your favorite colour.");
        String color = input.nextLine();
        System.out.println("You are " + firstname + " " + lastname + ", you are " + age + " years old and in grade " + grade + ". Your favorite colour is " + color  + ".");
}}