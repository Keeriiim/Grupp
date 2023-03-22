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
                           // en switch som väljer vilket object den ska skapa
                           
                        
                           
                           for (int i = 1; i < 3; i++) {
                            // monster.setAlive(true);
                            Monster monster = new Monster(i);
                            hero = new Warrior("Warrior", i);
                            System.out.println("Stage " + i);
                            monster.monsterStory();
                            System.out.println(monster.toString() +"\n"+ hero.toString());

                            while(monster.isAlive() || hero.isAlive()){
                                if(monster.getHp() <= 0){
                                    System.out.println("Monster is dead, let's keep moving");
                                    monster.setAlive(false);
                                    System.out.println("! Hero level up !");
                                    break;
                                }
                                else if(hero.getHp() <= 0){
                                    hero.setDead();
                                    System.out.println("! Hero level up !");
                                    break;
                                }


                                else
                                System.out.println("Monster attacks you for " + monster.getAttack() + " damage");
                                hero.setHp(-(monster.getAttack()));
                                

                                System.out.println(hero.getChoosenHero() + " attacks..." + hero.attackSound() + " with " + hero.getAttack() + " damage");
                                monster.setHp(-(hero.getAttack()));
                                System.out.println("Hero hp: " + hero.getHp());
                                System.out.println("Monster hp: " + monster.getHp());
                               
                                System.out.println("");
                            }

                            if(!(hero.isAlive())){ // Ends the game if the hero dies and returns the user back to main menu
                                System.out.println("Game Over!\n\n");
                                break;
                            }
                            System.out.println("\n\n\n");
                            monster.setLvl(1);
                            hero.setLvl(1);
                          
                            

                            
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
