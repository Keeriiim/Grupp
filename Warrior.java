public class Warrior extends Hero{
   
    public Warrior(){}

    public Warrior(String choosenHero, int lvl, int xp, int hp, int mana, int damage, int defense){
        super(choosenHero, lvl, xp, hp , mana, damage, defense);
    }

    public void printDefaultStatsAndAttacks(){
        System.out.println("Warrior or as they call them ...The Brute is a fierce force solid as a rock. With his high HP, defense and Attack are they easily able to destroy their foes.");
        System.out.println("The warrior has no mana but all his attacks are unpredictable in damage, it's almost as if your rolling a dice");
        System.out.println("!! Recommended Hero for beginners !!");
        System.out.println("Hp = 120\nAttack = 20\nDefense = 20");
    }

    public String attackSound(){
        return "Slaaaaaaaash !!";
    }


}
