import java.util.Random;

public class Monster{
    private int lvl;
    private int hp;
    private int attack;
    private int defense;
    private int xp;
    private boolean alive;
    Random rand = new Random();



    public Monster(int lvl){
        this.lvl = lvl;
        this.hp = 15 + (lvl * 14);
        this.attack = 200 + (2*lvl);
        this.defense = 2 + (2*lvl);
        this.xp = 10 * (10*lvl);
        this.alive = true;
    }

    public Monster(int lvl, int hp, int attack, int defense, int xp, boolean alive){
        this.lvl = lvl;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.xp = xp;
        this.alive = true;
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



    

    /**
     * @return the rand
     */
    public Random getRand() {
        return rand;
    }



    /**
     * @param rand the rand to set
     */
    public void setRand(Random rand) {
        this.rand = rand;
    }


    public void monsterStory(){
        int random = rand.nextInt(3)+1;
        switch(random){
            case 1:
            System.out.println("A terrible creature has spawned, beware !!!");
            break;
            case 2:
            System.out.println("hold your horses, we got some company !!");
            break;
            case 3:
            System.out.println("MONSTER AAAAAAAAAAAH !!!");
        }
    }

        public void monsterAttack(){
            int random = rand.nextInt(3)+1;
        switch(random){
            case 1:
            System.out.println("CLAW");
            break;
            case 2:
            System.out.println("BAAM");
            break;
            case 3:
            System.out.println("MONSTER AAAAAAAAAAAH !!!");
        }
    }


    public String toString(){ // Values to be printed every level and every round to update
        return "Monster:\nlvl = " + lvl + "\nhp = " + hp + "\nAttack = " + attack + "\ndefense = " + defense + "\n";
    }







    




    /*public int levelONe(){
        System.out.println("Level 1");
        System.out.println("A small creature appears in the dark alley");


        return;
    }*/
}