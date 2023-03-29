import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean mainMenu = true;

        Hero hero = null; // instantiates a hero object.
        Monster monster = null; // instantiates a monster object.
        Shop shop = null; // instantiates a shop object.

        

        while(mainMenu){
            int mainMenuChoice = menu.mainMenu(); // Få marcus åsikt om detta, är detta helt onödigt?
            switch(mainMenuChoice){
                case 1:
                int heroMenuChoice = menu.heroMenu();
                    switch(1){
                        case 1:
                           for (int i = 1; i < 11; i++) { // Set's the amout of total stages
                               monster = new Monster("Monster",i); // Instantiates an object of the class Monster
                               
                               if(heroMenuChoice == 1){ // Instantiates an object of the class Hero & choosen subclass Warror
                                  hero = new Warrior("Warrior", i);
                               }
                               else if(heroMenuChoice == 2){ // Instantiates an object of the class Hero & choosen subclass Warlock
                                  hero = new Warlock("Warlock", i);
                               } 
                               
                              
                               shop = new Shop(hero); // Instantiates an object of the class shop and takes the hero object as a parameter
                               shop.shopMenu(); // Enters the shop menu
                               if(hero.inventory.contains("Axe")||hero.inventory.contains("Staff")){ // Checks hero inventory if a staff or axe item is present, if it is adds 15 to attack
                                hero.setAttack(15);
                               }

                               if(hero.inventory.contains("Armor")||hero.inventory.contains("Robe")){ // Checks hero inventory if an Armor or a robe item is present, if it is adds 25 to health
                                hero.setHp(25);
                               }




                               System.out.println("******************* Stage " + i + " *******************"); // Prints the stage your at in the dungeon                
                               
                               if(i== 5 || i == 10){ // Algoritm to check if it is time for a boss fight
                                    System.out.println("********** BOSS FIGHT **********");
                                    Monster boss = new Boss("Dragon",i); // Instantiates a second object Monster with the subclass boss 

                                    while(boss.isAlive() || hero.isAlive()){ // A loop to continue the battle until either the hero or the Dragon is dead.
                                        if(boss.getHp() <= 0){ // Check's if the boss has died
                                          System.out.println(boss.getName() + " is dead, let's keep moving");
                                          boss.setAlive(false);
                                          System.out.println("! " + hero.getChoosenHero() + " level up !");
                                          break;
                                        }
                                        
                                        System.out.println(boss.toString() +"\n"+ hero.toString()+"\n\n"); // Prints all stats for the monster & hero before the battle begins
                                        boss.monsterAttack(hero);
                                        System.out.println(hero.getChoosenHero() + " hp: " + hero.getHp()+"\n\n\n");
                                        
                                        if(hero.getHp() <= 0){ // Check's if the Hero has died
                                           hero.setDead();
                                           System.out.println("! " + hero.getChoosenHero() + " is Dead, game Over !");
                                           break;
                                        }

                                    hero.spellOption(boss); // Print's the abilities of the hero class to choose between and updates monster hp
                                    System.out.println(boss.getName() + " hp: " + boss.getHp()+"\n\n\n");

                                    }
                                    
                                continue;
                               }






                               
                               monster.monsterStory(); // Prints 1 of 3 texts when the monster appears
                               System.out.println(monster.toString() +"\n"+ hero.toString()+"\n\n"); // Prints all stats for the monster & hero before the battle begins
                            
                               while(monster.isAlive() || hero.isAlive()){ // A loop to continue the battle until either the hero or the monster is dead.
                                    if(monster.getHp() <= 0){ // Check's if the monster has died
                                       System.out.println(monster.getName() + " is dead, let's keep moving");
                                       monster.setAlive(false);
                                       System.out.println("! " + hero.getChoosenHero() + " level up !");
                                       break;
                                    }

                                monster.monsterAttack(hero); // Randomly chooses an attack, a text output and updates hero hp
                                System.out.println(hero.getChoosenHero() + " hp: " + hero.getHp()+"\n\n\n");

                                    if(hero.getHp() <= 0){ // Check's if the Hero has died
                                       hero.setDead();
                                       System.out.println("! "+ hero.getChoosenHero() + " is Dead, game Over !"); ////// funkar denna           ??????
                                       break;
                                    }

                                hero.spellOption(monster); // Print's the abilities of the hero class to choose between and updates monster hp
                                System.out.println(monster.getName() + " hp: " + monster.getHp()+"\n\n\n");
                               }

                               if(!(hero.isAlive())){ // Ends the game if the hero dies and returns the user back to main menu
                                   System.out.println("Game Over!\n\n");
                                   break;
                                }
                                System.out.println("\n");
                                monster.setLvl(1); // Adds another level at the end of each finished stage for scaling
                                hero.setLvl(1);  // Adds another level at the end of each finished stage for scaling
                                hero.setGold(100);
                                System.out.println("Gold: hero.getGold()");
                           } // end scope of Stages
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
