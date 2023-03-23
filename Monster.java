import java.util.Random;

public class Monster{
    private String creature;
    private int lvl;
    private int hp;
    private int attack;
    private int defense;
    private int xp;
    private boolean alive;
    Random rand = new Random();



    public Monster(){}

    public Monster(String creature, int lvl){
        this.creature = creature;
        this.lvl = lvl;
        this.hp = 15 + (lvl * 14);
        this.attack = 25 + (2*lvl);
        this.defense = 2 + (2*lvl);
        this.xp = 10 * (10*lvl);
        this.alive = true;
    }


    public String getName(){
        return creature;
    }


 /**
     * @return the lvl
     */
    public int getLvl() {
        return lvl;
    }



    /**
     * @param lvl the lvl to set
     */
    public void setLvl(int lvl) {
        this.lvl += lvl;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }



    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp += hp;
    }





    /**
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }



    /**
     * @param attack the attack to set
     */
    public void setAttack(int attack) {
        this.attack += attack;
    }



    /**
     * @return the defense
     */
    public int getDefense() {
        return defense;
    }



    /**
     * @param defense the defense to set
     */
    public void setDefense(int defense) {
        this.defense += defense;
    }



    /**
     * @return the xp
     */
    public int getXp() {
        return xp;
    }



    /**
     * @param xp the xp to set
     */
    public void setXp(int xp) {
        this.xp += xp;
    }


    /**
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }



    /**
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }



    



    public void monsterStory(){
        int random = rand.nextInt(3)+1;
        switch(random){
            case 1:
            System.out.println("A terrible creature has spawned, beware !!!\n");
            break;
            case 2:
            System.out.println("hold your horses, we got some company !!\n");
            break;
            case 3:
            System.out.println("MONSTER AAAAAAAAAAAH !!!\n");
        }
    }


        public void monsterAttack(Hero hero){
            int random = rand.nextInt(2)+1;
        switch(random){
            case 1:
            System.out.println("Monster attacks you for " + getAttack() + " damage");
            System.out.println("******* CLAW *******");
            hero.setHp(-(getAttack()));
            break;

            case 2:
            System.out.println("Monster attacks you for " + (getAttack()-5) + " damage");
            System.out.println("******* SCRATCH *******");
            hero.setHp(-(getAttack()-5));
            break;
        }
    }


    public String toString(){ // Values to be printed every level and every round to update
        return creature + ":\nlvl = " + lvl + "\nhp = " + hp + "\nAttack = " + attack + "\ndefense = " + defense + "\n";
    }
}