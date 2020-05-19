package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Scanner input = new Scanner(System.in);
        dog1.name = "Spot";
        dog1.age = 2;
        dog1.breed = "Shiba Inu";
        dog1.size = "Small";
        dog1.FurColor = "Golden Brown";
        dog1.OwnerLastName = "Imagawa";
        
        dog2.name = "Hunter";
        dog2.age = 4;
        dog2.breed = "German Shepard";
        dog2.size = "Large";
        dog2.FurColor = "Black and Brown";
        dog2.OwnerLastName = "Jackson";

        dog3.name = "Ace";
        dog3.age = 3;
        dog3.breed = "Husky";
        dog3.size = "Medium";
        dog3.FurColor = "White and Grey";
        dog3.OwnerLastName = "Anderson";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.breed);

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.breed);

        System.out.println(dog3.name);
        System.out.println(dog3.age);
        System.out.println(dog3.breed);

    }}      