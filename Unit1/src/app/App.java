package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter password.");
        String password = input.nextLine();
        if (password.equals("183726073"))
        System.out.println("ACCESS GRANTED");
        else System.out.println("ACCESS DENIED");
        
   
    }}      