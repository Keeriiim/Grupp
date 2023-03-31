import java.util.Scanner;
public class Menu {
    Scanner scan = new Scanner(System.in);
    Warrior warrior = new Warrior(); 
    Warlock warlock = new Warlock();
    int choice;
    

    public Menu(){}

    public int mainMenu(){
         do {
            System.out.println("Welcome to the best RPG Game");
            System.out.println("1. Start Game");
            System.out.println("2. Quit");
            System.out.print("Enter your choice: ");
            try {
                 choice = scan.nextInt();
                 if (choice != 1 && choice != 2) {
                    System.out.println("Invalid input! Please enter 1 or 2\n");
                 }
            } 
            catch (Exception e) {
                 System.out.println("Invalid input! Please enter an integer value(1 or 2):\n");
                 scan.next(); // discard invalid input
                 choice = 0;
            }
        } 
        while (choice != 1 && choice != 2);
        
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
