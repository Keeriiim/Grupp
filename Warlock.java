import java.util.Scanner;

class Warlock extends Hero {
    Scanner scan = new Scanner(System.in);
   
    public Warlock(){}

    public Warlock(String choosenHero, int lvl){
        super(choosenHero, lvl);
    }

    public void printDefaultStatsAndAttacks(){
        System.out.println("Warlock or as they call them ...The spellcaster is a nightmare to deal with. With his high HP, defense and Attack are they easily able to destroy their foes.");
        System.out.println("The warlock has mana and all his attacks are unpredictable in damage, it's almost as if your rolling a dice");
        System.out.println("!! Recommended for advanced RPG-players !!");
        System.out.println("Hp = 100\nAttack = 30\nDefense = 15");
    }

    public String attackSound(){
        return "******* zzZZZZoommm *******";
    }

    public void spellOption(Monster monster){
        System.out.println("-- !!! Your time to attack !!! --");
        System.out.println("1. Normal attack\n2. Deathbolt");;
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        System.out.println("\n");

        switch(choice){ // Attacks the monster depending on the choosen spellattack
            case 1:
            System.out.println(getChoosenHero() + " attacks with " + getAttack() + " damage");
            System.out.println(attackSound());
            monster.setHp(-(getAttack()));
            break;

            case 2:
            System.out.println(getChoosenHero() + " casts his Deathbolt " + 2*(getAttack()) + " damage");
            System.out.println(attackSound());
            monster.setHp(-2*(getAttack()));

        }         
    }



}

