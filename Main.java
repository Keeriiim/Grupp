import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);

        boolean mainMenu = true;

        Hero hero = null; // declare hero variable outside of the switch statement so i can recall it and get any value i need.

        

        while(mainMenu){
            int mainMenuChoice = menu.mainMenu(); // Få marcus åsikt om detta, är detta helt onödigt?
            switch(mainMenuChoice){
                case 1:
                    switch(menu.heroMenu()){
                        case 1:
                           hero = new Warrior("Warrior", 1, 0, 120, 0, 20, 20);
                           // start . game
                        break;

                    } // switch heromenu
                    break; // Belongs to case 1
            
                case 2:
                    mainMenu = false;
                    System.out.println("Game ends, good bye!\n");
                    break; // Belongs 
            } // Switch mainMenuChoice






        } // While mainMenu
        
    }
    
}
