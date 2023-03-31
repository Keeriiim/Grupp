import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu(); // instantiates a menu object.
        boolean mainMenu = true; // Starts the game / activates the main menu
        Hero hero = null; // instantiates a hero object.
        Monster monster = null; // instantiates a monster object.
        Shop shop = null; // instantiates a shop object.
       

        

        
            
            while(mainMenu){
            int mainMenuChoice = menu.mainMenu(); // Prints main menu options
            switch(mainMenuChoice){
                case 1:
                int heroMenuChoice = menu.heroMenu();
                
                switch(1){
                    case 1:
                    System.out.print("How manny stage's do you want to play?: ");
                    int setTheStages = scan.nextInt(); // Asks for the amount of total stages
                           
                    if(heroMenuChoice == 1){ // Instantiates an object of the class Hero & choosen subclass Warror
                       hero = new Warrior("Warrior", 1);
                    }
                    else if(heroMenuChoice == 2){ // Instantiates an object of the class Hero & choosen subclass Warlock
                       hero = new Warlock("Warlock", 1);
                    } 
                    
                    
                    for (int i = 0; i < setTheStages; i++) { // Set's the amout of total stages
                    monster = new Monster("Monster",(i+1)); // Instantiates a new Monster object every round
 
                      if(i != 0 && (i+1) %4 == 0){
                        shop = new Shop(hero); // Instantiates an object of the class shop and takes the hero object as a parameter
                        shop.shopMenu(); // Enters the shop menu
                        if(hero.inventory.contains("Axe")||hero.inventory.contains("Staff")){ // Checks hero inventory if a staff or axe item is present, if it is adds 15 to attack
                            System.out.println("ATTACK BEFORE AXE/STAFF " + hero.getAttack());
                            hero.setBonusAttack(15);
                            System.out.println("ATTACK AFTER AXE/STAFF " + hero.getAttack());
                        }

                        if(hero.inventory.contains("Armor")||hero.inventory.contains("Robe")){ // Checks hero inventory if an Armor or a robe item is present, if it is adds 25 to health
                            hero.setHp(25);
                        }
                       }
                    



                       try {
                        Thread.sleep(2000); // Delay the program for 2 seconds
                    } catch (Exception e) {
                       System.out.println("");
                    }

                               System.out.println("\n******************* Stage " + ((i+1)) + " *******************"); // Prints the stage your at in the dungeon                
                               
                               if((i+1) != 0 && (i+1) %5 == 0){ // Algoritm to check if it is time for a boss fight
                                    System.out.println("********** BOSS FIGHT **********");
                                    Monster boss = new Boss("Dragon",monster.getLvl()); // Instantiates a second object Monster with the subclass boss 

                                    while(boss.isAlive() || hero.isAlive()){ // A loop to continue the battle until either the hero or the Dragon is dead.
                                        if(boss.getHp() <= 0){ // Check's if the boss has died
                                          System.out.println(boss.getName() + " is dead, let's keep moving");
                                          boss.setAlive(false);
                                          System.out.println("! " + hero.getChoosenHero() + " level up !\n");
                                          break;
                                        }
                                        
                                        // Prints all attributes of Monster and Hero
                               System.out.println("         " + boss.getName() + "    " + hero.getChoosenHero());
                               System.out.println("Lvl:     " + boss.getLvl() + "          " + hero.getLvl());
                               System.out.println("Hp:      " + boss.getHp() + "         " + hero.getHp());
                               System.out.println("Attack:  " + boss.getAttack() + "         " + hero.getAttack());
                               System.out.println("Defense: " + boss.getDefense() + "          " + hero.getDefense());
                               System.out.println("\n");


                                        boss.monsterAttack(hero);
                                        System.out.println(hero.getChoosenHero() + " hp: " + hero.getHp()+"\n\n");
                                        
                                        if(hero.getHp() <= 0){ // Check's if the Hero has died
                                           hero.setDead();
                                           System.out.println("! " + hero.getChoosenHero() + " is Dead, game Over !");
                                           break;
                                        }

                                    hero.spellOption(boss); // Print's the abilities of the hero class to choose between and updates monster hp
                                    System.out.println(boss.getName() + " hp: " + boss.getHp()+"\n\n");

                                    }
                                    
                                continue;
                               }


                               // Prints al attributes of Monster and Hero
                               System.out.println("         " + monster.getName() + "    " + hero.getChoosenHero());
                               System.out.println("Lvl:     " + monster.getLvl() + "          " + hero.getLvl());
                               System.out.println("Hp:      " + monster.getHp() + "         " + hero.getHp());
                               System.out.println("Attack:  " + monster.getAttack() + "         " + hero.getAttack());
                               System.out.println("Defense: " +monster.getDefense() + "          " + hero.getDefense());
                               System.out.println("\n");



                            
                               while(monster.isAlive() || hero.isAlive()){ // A loop to continue the battle until either the hero or the monster is dead.
                                    if(monster.getHp() <= 0){ // Check's if the monster has died
                                       System.out.println(monster.getName() + " is dead, let's keep moving");
                                       monster.setAlive(false);
                                       System.out.println("! " + hero.getChoosenHero() + " level up !");
                                       break;
                                    }

                                monster.monsterAttack(hero); // Randomly chooses an attack, a text output and updates hero hp
                                System.out.println(hero.getChoosenHero() + " hp: " + hero.getHp()+"\n\n");

                                    if(hero.getHp() <= 0){ // Check's if the Hero has died
                                       hero.setDead();
                                       System.out.println("! "+ hero.getChoosenHero() + " is Dead, game Over !");
                                       break;
                                    }

                                hero.spellOption(monster); // Print's the abilities of the hero class to choose between and updates monster hp
                                System.out.println(monster.getName() + " hp: " + monster.getHp()+"\n\n");
                               }

                              if(!(hero.isAlive())){ // Ends the game if the hero dies and returns the user back to main menu
                                   System.out.println("Game Over!\n\n");
                                   break;
                                }
                                 

                                 
                                monster.setLvl(1); // Adds another level at the end of each finished stage for scaling
                                hero.setLvl(1);  // Adds another level at the end of each finished stage for scaling
                                hero.setAttack(hero.getLvl());
                                hero.setGold(20); // Adds x amout of gold to the hero after each completed stage
                                System.out.println("Gold: " + hero.getGold()); // Prints the amout of gold you got
                           } // end scope of Stages
                        break; // Belongs to case 1 in heromenu
                    
                        
                    }
                    if(hero.isAlive()){
                        System.out.println("\n ------------ !You won the Game! ------------ \n\n");
                    }
                        break;
   
            
                case 2:
                    mainMenu = false;
                    System.out.println("Game ends, good bye!\n");
                    scan.close(); // Closes the scan
                    break; 
            } // Switch mainMenuChoice

        } // While mainMenu scope 
    }   // main scope
} // class schope
