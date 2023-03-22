import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);
        int levels = 11;

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
                           Monster monster = new Monster();
                           for (int i = 1; i < 11; i++) {
                            monster.setAlive(true);
                            System.out.println("Level " + i);
                            monster.monsterStory();
                            System.out.println(monster.toString());

                            while(monster.isAlive()){
                                if(monster.getHp()<= 0){
                                    System.out.println("Monster is dead, let's keep moving");
                                    monster.setAlive(false);
                                }


                                else
                                System.out.println("Monster attacks you for " + monster.getAttack() + " damage");
                                System.out.println(hero.getHp());
                                hero.setHp(-(monster.getAttack()));
                                System.out.println(hero.getHp());
                                
                                System.out.println(hero.getChoosenHero() + " attacks..." + hero.attackSound());
                               
                                System.out.println("");
                                break;
                            }
                            
                           }
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
