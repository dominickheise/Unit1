package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception{
   System.out.println("Start first loop");
   for (int x = 0; x <= 19; x++){
       System.out.println(x);
   }


   System.out.println("End first loop");
   System.out.println("Start second loop");
   for (int x = -1; x <= 19; x++){
       if (x % 2 == 0) {
           System.out.println(x);
       }else {
           System.out.println(x++);
        }
       
   }
   System.out.println("End second loop");


    
}
}