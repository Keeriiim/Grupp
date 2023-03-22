import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);
        int levels = 11;
        int choice;

        boolean mainMenu = true;

        Hero hero = null; // declare hero variable outside of the switch statement so i can recall it and get any value i need.

        

        while(mainMenu){
            int mainMenuChoice = menu.mainMenu(); // Få marcus åsikt om detta, är detta helt onödigt?
            switch(mainMenuChoice){
                case 1:
                    switch(menu.heroMenu()){
                        case 1:
                           // en switch som väljer vilket object den ska skapa

                           for (int i = 1; i < 3; i++) {
                            
                            Monster monster = new Monster(i); // Instantiate an object of the class Monster
                            hero = new Warrior("Warrior", i); // Instantiate an object of the class Hero & choosen subclass Warror / Warlock
                            System.out.println("******************* Stage " + i + " *******************"); // Prints the stage your at in the dungeon
                            monster.monsterStory(); // Prints 1 of 3 texts when the monster appears
                            System.out.println(monster.toString() +"\n"+ hero.toString()+"\n\n"); // Prints all stats for the monster & hero before the battle begins

                            while(monster.isAlive() || hero.isAlive()){ // A loop to continue the battle until either the hero or the monster is dead.

                                if(monster.getHp() <= 0){ // Check's if the monster has died
                                    System.out.println("Monster is dead, let's keep moving");
                                    monster.setAlive(false);
                                    System.out.println("! Hero level up !");
                                    break;
                                }

                                System.out.println("Monster attacks you for " + monster.getAttack() + " damage");
                                monster.monsterAttack();
                                hero.setHp(-(monster.getAttack()));
                                System.out.println("Hero hp: " + hero.getHp()+"\n");

                                if(hero.getHp() <= 0){ // Check's if the Hero has died
                                    hero.setDead();
                                    System.out.println("! Hero level up !");
                                    break;
                                }

                                hero.spellOption(monster); // Print's the abilities of the hero class to choose between and updates monster hp
                                System.out.println("Monster hp: " + monster.getHp()+"\n");
                               
                            }

                            if(!(hero.isAlive())){ // Ends the game if the hero dies and returns the user back to main menu
                                System.out.println("Game Over!\n\n");
                                break;
                            }
                            System.out.println("\n\n\n");
                            monster.setLvl(1); // Adds another level at the end of each finished stage for scaling
                            hero.setLvl(1);  // Adds another level at the end of each finished stage for scaling
                          

                            
                           }
                        break; // Belongs to case 1 in heromenu
                    } // switch heromenu

                break; // Belongs to case 1 mainmenuchoice
            
                case 2:
                    mainMenu = false;
                    System.out.println("Game ends, good bye!\n");
                    break; // Belongs 
            } // Switch mainMenuChoice






        } // While mainMenu scope 
    }   // main scope
} // class schope
