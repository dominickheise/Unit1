package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception{
   System.out.println("Start first loop");
   for (int x = 20; x >= 0; x = x - 1){
       System.out.println(x);
       if (x == 10) 
            for (int y = 0; y < 7; y++) 
       System.out.println(x);
   }


   System.out.println("End first loop");
   System.out.println("Start second loop");
   for (int x = 4; x <= 36; x = x + 4){
       System.out.println(x);
       if (x % 12 == 0){
           System.out.println("Hey!");
           
       }
   }
   System.out.println("End second loop");


    
}
}