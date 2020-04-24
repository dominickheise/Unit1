package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start first loop");
        for (int x = 1; x <= 10; x++) {
            if (x == 5){
                System.out.println("five");
        }else System.out.println(x);      
    }
        System.out.println("End first loop");
        System.out.println("Start second loop");
        for (int x = 100; x <= 200; x = x +10) {
            System.out.println(x);
            if (x == 150){
                for (int y = 150; y <= 159; y++){
                    System.out.println(y);
                }
            }
        }
        System.out.println("End second loop");

    }
}