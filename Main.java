import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Hero hero = null; // declare hero variable outside of the switch statement so i can recall it and get any value i need.

        System.out.println("Choose ur HeroClass");
        System.out.println("1. Warrior\n2. Warlock\n3. Hunter");
        int choice = scan.nextInt();

        switch(choice){
        case 1:
            hero = new Warrior("Warrior", 1, 0, 120, 0, 10, 20);
            System.out.println("You choose Warrior");
            System.out.println(hero.toString());
            break;
        }

        System.out.println(hero.toString());

    }
    
}
