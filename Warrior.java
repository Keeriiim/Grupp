import java.util.Scanner;
public class Warrior extends Hero{
    Scanner scan = new Scanner(System.in);
   
    public Warrior(){}

    public Warrior(String choosenHero, int lvl){
        super(choosenHero, lvl);
    }

    public void printDefaultStatsAndAttacks(){
        System.out.println("Warrior or as they call them ...The Brute is a fierce force solid as a rock. With his high HP, defense and Attack are they easily able to destroy their foes.");
        System.out.println("The warrior has no mana but all his attacks are unpredictable in damage, it's almost as if your rolling a dice");
        System.out.println("!! Recommended Hero for beginners !!");
        System.out.println("Hp = 120\nAttack = 20\nDefense = 20");
    }

    public String attackSound(){
        return "******* Slaaaaaaaash *******";
    }

    public void spellOption(Monster monster){
        System.out.println("-- !!! Your time to attack !!! --");
        System.out.println("1. Normal attack\n2. Slashing through my foes");;
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
            System.out.println(getChoosenHero() + " Double Attacks with " + 2*(getAttack()) + " damage");
            System.out.println(attackSound());
            monster.setHp(-2*(getAttack()));

        }         
    }



}
