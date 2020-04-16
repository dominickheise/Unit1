package app;

import javax.net.ssl.SSLKeyException;

public class App {
    public static void main(String[] args) throws Exception{
   
  for (int i = 22; i <= 28; i = i +3){
      System.out.println(i);
}
for (int i = 2; i <= 32; i = i *2){
    System.out.println(i);
}
for (int i = 3; i >= -81; i = i *-i) {
     System.out.println(+ i);
}
for (int i = 50; i >= 5; i = i -5){
    System.out.println(i);
}
int [] intArray = {1, 4, 1, 4, 5, 2, 9, 6, 3, 16, 7, 4, 25, 8, 5, 36, 9, 6, 49, 10, 7, 64, 11, 8, 81, 12, 9};
    for(int i=0; i<intArray.length; i++) {
      System.out.println(intArray[i]);
    }
}
}