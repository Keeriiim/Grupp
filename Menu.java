import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    Warrior warrior = new Warrior();    ;

    public Menu(){

    }

    public int mainMenu(){
        System.out.println("1.Start Game\n2.Quit");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        return choice;
    }

    public int heroMenu(){
        System.out.println("Choose your hero:\n1.Warrior");
        warrior.printDefaultStatsAndAttacks();
        System.out.println("\n2.Warlock ------");
        System.out.println("");
        System.out.println("");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        System.out.println("");
        return choice;
    }
    
}
