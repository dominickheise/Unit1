package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception{
   
  for (int x = 1; x <= 20; x++){
      if (x % 4 ==0){
          System.out.println(x + " is divisible by 4");
      }
      else {
          System.out.println(x + " is not divisible by 4");
      }
  }

    
}
}