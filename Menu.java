import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    Warrior warrior = new Warrior(); 
    Warlock warlock = new Warlock();
    

    public Menu(){}

    public int mainMenu(){
        System.out.println("Welcome to the best RPG Game");
        System.out.println("1. Start Game");
        System.out.println("2. Quit");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = 0;
        while (true) {
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (1 or 2):");
                scan.next(); // discard invalid input
                continue;
            }
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Starting new game...");
                    return choice;
                case 2:
                    System.out.println("Goodbye!");
                    return choice;
                default:
                    System.out.println("Invalid choice! Please enter 1 or 2:");
            }
        }
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
