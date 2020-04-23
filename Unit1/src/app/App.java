package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Double or single digit?");
        for (int x = 20; x >= 1; x = x - 1) {
            if (x >= 10)
                System.out.println(x + " is a double digit");
            else
                System.out.println(x + " is a single digit");
        }
        System.out.println("Nice!");
        System.out.println("Fast food");
        for (int x = 1; x <= 7; x++) {
            if (x % 2 == 0) {
                System.out.println("Burgers");

            } else
                System.out.println("Fries");
        }
        System.out.println("Nice!");

    }
}