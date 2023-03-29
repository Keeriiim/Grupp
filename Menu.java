import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    Warrior warrior = new Warrior(); 
    Warlock warlock = new Warlock();
    

    public Menu(){

    }

    public int mainMenu(){
        System.out.println("1.Start Game\n2.Quit");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        return choice;
    }

    public int heroMenu(){
        System.out.println("\n\n\nChoose your hero:\n1.Warrior");
        warrior.printDefaultStatsAndAttacks();
        System.out.println("\n2.Warlock ");
        warlock.printDefaultStatsAndAttacks();
        System.out.println("");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        System.out.println("");
        return choice;
    }
    
}
