import java.util.Scanner;

public class Shop {
    Scanner scan = new Scanner(System.in);
    private int menuChoice;
    private int secondChoice;
    private int itemChoice;
    private boolean shopMenu;
    Hero hero;


    public Shop(){
        
    }
    public Shop(Hero hero){
        this.hero = hero;
    }



    public void shopMenu(){
        this.shopMenu = true;
        while(shopMenu){
        System.out.println("\n\n! Welcome to the secret shop !");
        System.out.println("1.Shop\n2.exit");
        System.out.print("Your choice: ");
        this.menuChoice = scan.nextInt();

        switch(menuChoice){
            case 1:
                System.out.println("\n1.Weapon\n2.Health");
                System.out.print("Your choice: ");
                secondChoice = scan.nextInt();
                switch(secondChoice){
                    case 1:
                    System.out.println("\n1.Axe (+15 attack, cost 50 gold)\n2.Staff (+15 attack, cost 50 gold)");
                    System.out.println("Your Gold: " + hero.getGold());
                    System.out.print("Your choice: ");
                    itemChoice = scan.nextInt();
                    switch(itemChoice){
                        case 1:
                        if(hero.inventory.contains("Axe") == true){
                            System.out.println("Item already in your inventory\n");
                        }
                        else{
                            if(hero.getGold()>50){
                                hero.setGold(-50);
                                System.out.println("You just bought an Axe for 50 gold");
                                hero.inventory.add("Axe");
                                System.out.println("Gold left: " + hero.getGold());
                            }
                            else {
                                System.out.println("Not enough gold !");
                                System.out.println("Axe cost: 50 gold");
                                System.out.println("Hero Gold: " + hero.getGold());
                            }
                        }
                        break;

                        case 2:
                        if(hero.inventory.contains("Staff")){
                            System.out.println("Item already in your inventory\n\n");
                        }
                        else{
                            if(hero.getGold()>50){
                                hero.setGold(-50);
                                System.out.println("You just bought a Staff for 50 gold");
                                hero.inventory.add("Staff");
                                System.out.println("Gold left: " + hero.getGold());
                            }
                            else {
                                System.out.println("Not enough gold !");
                                System.out.println("Staff cost: 50 gold");
                                System.out.println("Hero Gold: " + hero.getGold());
                            }
                        }
                        break; // break for case 1 itemChoice
                    }
                break; // break for case 1 secondChoice

                case 2:
                System.out.println("\n1.Armor (+25 hp, cost 50 gold)\n2.Robe (+25 hp, cost 50 gold)");
                System.out.println("Your Gold: " + hero.getGold());
                System.out.print("Your choice: ");
                itemChoice = scan.nextInt();
                switch(itemChoice){
                    case 1:
                       if(hero.inventory.contains("Armor") == true){
                          System.out.println("Item already in your inventory\n");
                       }
                       else{
                        if(hero.getGold()>50){
                            hero.setGold(-50);
                            System.out.println("You just bought an Armor for 50 gold");
                            hero.inventory.add("Armor");
                            System.out.println("Gold left: " + hero.getGold());
                        }
                        else {
                            System.out.println("Not enough gold !");
                            System.out.println("Armor cost: 50 gold");
                            System.out.println("Hero Gold: " + hero.getGold());
                        }                     
                       }
                    break; // break case 1 itemChoice

                    case 2:
                    if(hero.inventory.contains("Robe")){
                        System.out.println("Item already in your inventory\n\n");
                     }
                     else{
                        if(hero.getGold()>50){
                            hero.setGold(-50);
                            System.out.println("You just bought a Robe for 50 gold");
                            hero.inventory.add("Robe");
                            System.out.println("Gold left: " + hero.getGold());
                        }
                        else {
                            System.out.println("Not enough gold !");
                            System.out.println("Robe cost: 50 gold");
                            System.out.println("Hero Gold: " + hero.getGold());
                        }
                     }
                    break; // break for case 2 itemChoice
                }
                break; // break for case 2 secondChoice
            }

            break; // break for case 1 menuChoice
       
            case 2:
            System.out.println("See you next time!\n"); // Output text for leaving the shop
            this.shopMenu = false;
            break; // break for case 2 firstChoice
        }




    }
}




}
