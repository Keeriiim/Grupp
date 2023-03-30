import java.util.ArrayList;
public class Hero {
        private String choosenHero;
        private int lvl;
        private int xp;
        private int hp;
        private int attack;
        private int defense;
        private boolean attackPassive = false;
        private boolean hpPassive = false;
        private boolean alive = true;
        private int gold;
        ArrayList <String> inventory = new ArrayList<>();
    
    
        public Hero(){}

        public Hero(String choosenHero, int lvl){
            this.choosenHero = choosenHero;
            this.lvl = lvl;
            this.hp = 220 + (lvl * 5);
            this.attack = 46 + (4*lvl);
            this.defense = 20 + (2*lvl);
            this.xp = 10 * (10*lvl);
            this.alive = true;
            this.gold = 0;
        }

        public String getChoosenHero() {
            return choosenHero;
        }

        public boolean isAlive(){
            return alive;
        }
        
        public boolean setAlive(){
            this.alive = true;
            return alive;
        }

        public boolean setDead(){
            this.alive = false;
            return alive;
        }

      
        public int getAttack() {
            return attack;
        }

       
        public void setAttack(int attack) {
            this.attack += attack;
        }
    
        public int getHp() {
            return hp;
        }

      
        public void setHp(int hp) {
            this.hp += hp;
        }

        public void setLvl(int lvl) {
            this.lvl += lvl;
        }

        public int getGold(){
            return this.gold;
        }

        public void setGold(int gold){
             this.gold = gold;
        }

        public boolean getAttackPassive(){
            return attackPassive;
        }

        public void setAttackPassive(){
            this.attackPassive = true;
        
        }

       
    

        public void spellOption(Monster monster){

        }

        public String printAttackSound(){
            return "";
        }

        @Override
        public String toString() {
            return getChoosenHero()+":\nlvl = " + lvl + "\nhp = " + hp + "\nAttack = " + attack + "\ndefense = " + defense + "\n";
        }

        
    
        
    
}
