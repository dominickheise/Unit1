package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception{
   
  for (int i = 10; i <= 20; i = i +1){
      System.out.println("The count is " + i);
      System.out.println("Let's keep counting");
}
for (int i = 10; i <= 100; i = i +10){
    System.out.println("The count is " + i);
    System.out.println("Let's keep counting");
}
for (int i = 1000; i <= 256000; i = i +2000){
    System.out.println("The count is " + i);
    System.out.println("Let's keep going");
}
for (double i = 11; i <= 12; i = i + 0.1) {
    System.out.println("The count is " + i);
    System.out.println("Let's keep counting");
}
for (int i = 10; i >= 0; i = i -1){
    System.out.println("The count is " + i);
    System.out.println("Let's keep counting");
}

}
}