package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number.");
        int numb1 = input.nextInt();

        System.out.println("Entaer another number");
        int numb2 = input.nextInt();

        System.out.println("Enter a function; press 1 for +, 2 for -, 3 for *, and 4 for /");
        int func = input.nextInt();
        if (func == 1){
            System.out.println("+");
        } 
        if (func == 2){
            System.out.println("-");
        }
        if (func == 3){
            System.out.println("*");
        }
        if (func == 4){
            System.out.println("/");
        }

        System.out.println(numb1 + func + numb2);

    }}      